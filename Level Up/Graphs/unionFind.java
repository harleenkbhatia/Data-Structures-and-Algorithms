import java.util.ArrayList;

public class unionFind{

    public static void addEdge(ArrayList<Edge>[] graph, int u, int v, int w){
        graph[u].add(new Edge(v, w));
        graph[v].add(new Edge(u, w));
    }

    // Time Complexity = O(2E)
    public static void display(ArrayList<Edge>[] graph){
        int N = graph.length;
        for(int i = 0; i<N; i++){
            System.out.print(i + " -> ");
            for(Edge e : graph[i]){
                System.out.print("("+e.v+", "+e.w+") ");
            }
            System.out.println();
        }
    } 

    static int[] par, size; //so that bar bar pass na krna pde functions m
    //amortised o(1)
    public static int findParent(int u){
        if(par[u] == u) return u;
        return par[u] = findParent(par[u]);

        //return par[u] == u ? u : par[u] = findParent(par[u]);
    }

    public static void union(int p1, int p2){
        if(size[p1] < size[p2]){
            par[p1] = p2;
            size[p2] += size[p1];
        } else{
            par[p2] = p1;
            size[p1] += size[p2];
        }}
    }

    //{{u1,v1,w1}, {u2,v2,w2}....}
    public static void unionFind(int[][] edges){
        int N = edges.length;
        ArrayList<Edge>[] graph = new ArrayList[N];
        for(int i = 0; i < N; i++)
            graph[i] = new ArrayList<>();


        par = new int[N]; // parent arr
        size = new int[N]; //size arr

        for(int i = 0; i < N; i++){
            par[i] = i;
            size[i] = 1;
        }
        for(int[] e : edges){
            int u = e[0], v = e[1], w = e[2];
            int p1 = findParent(u);
            int p2 = findParent(v);

            if(p1 != p2){
                union(p1, p2);
                addEdge(graph, u, v, w);
            }
        }
    }
}