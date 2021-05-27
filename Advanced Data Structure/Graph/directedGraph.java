import java.util.ArrayList;
import java.util.PriorityQueue;

public class directedGraph{
    public static class Edge{
        int v = 0;
        int w = 0;

        Edge(int v, int w){
            this.v = v;
            this.w = w;
        }
        public String toString() {
            return "(" + this.v + "," + this.w + ") ";
        }
    }

    public static int N = 7;
    public static ArrayList<Edge>[] graph = new ArrayList[N];

    public static void addEdge(int u, int v, int w){
        graph[u].add(new Edge(v, w));
    }
    public static void display(){
        for(int i = 0; i < N; i++){
            System.out.print(i + " -> ");
            for(Edge e : graph[i]){
                System.out.print(e);
            }
            System.out.println();
        }
    }
    public static void dfs_topo(int src, boolean[] vis, ArrayList<Integer> topoOrder){
        vis[src] = true;
        for(Edge e : graph[src]){
            if(!vis[e.v])
                dfs(e.v, vis, topoOrder);
        }
        topoOrder.add(src);
    }
    public static void topologicalSort(){
        boolean vis[] = new boolean[N];
        ArrayList<Integer> topoOrder = new ArrayList<>();
        for(int i = 0; i<N; i++){
            if(!vis[i])
                dfs_topo(i, vis, topoOrder);
        }

    }
    public static void main(String[] args){
        for(int i = 0; i < N; i++)
            graph[i] = new ArrayList<>();
    
    }
}