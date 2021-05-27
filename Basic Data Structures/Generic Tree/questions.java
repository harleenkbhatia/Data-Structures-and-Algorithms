import java.util.ArrayList;

public class basic{
    public static class Node{
        int data = 0;
        ArrayList<Node> childs = new ArrayList();

        Node(int data){
            this.data = data;
        }
    }
    public static boolean nodeToRootPath(Node node, int data, ArrayList<Integer> list){
        boolean res = node.data == data;
        for(Node child : node.children) {
            res = res || nodeToRootPath(child, data, list);
        }
        if(res) list.add(node.data);
        return res;
    } //main
    // Node root = construct(arr);
    // ArrayList<Integer> path = new ArrayList<>(); 
    // nodeToRootPath(root, data, path);
    // System.out.println(path);

    public static boolean nodeToRootPath(Node node, int data, ArrayList<Node> list){
        boolean res = node.data == data;
        for(Node child : node.children) {
            res = res || nodeToRootPath(child, data, list);
        }
        if(res) list.add(node);
        return res;
    }
    public static int lowestCommon(Node node, int p, int q){
        ArrayList <Node> list1 = new ArrayList<>();
        ArrayList <Node> list2 = new ArrayList<>();
        
        nodeToRootPath(node, p, list1);
        nodeToRootPath(node, q, list2);
        
        int i = list1.size() - 1;
        int j = list2.size() - 1;
        
        Node lca = null;
        while(i>=0 && j>=0){
            if(list1.get(i) != list2.get(j))
                break;
            
            lca = list1.get(i);
            i--;
            j--;
        }
        return lca.data;
    }
    public static int distanceBetweenNodes(Node node, int p, int q){
        ArrayList <Node> list1 = new ArrayList<>();
        ArrayList <Node> list2 = new ArrayList<>();
        
        nodeToRootPath(node, p, list1);
        nodeToRootPath(node, q, list2);
        
        int i = list1.size() - 1;
        int j = list2.size() - 1;
        
        int lcaDistance = 0;
        while(i>=0 && j>=0){
            if(list1.get(i) != list2.get(j))
                break;
                
            lcaDistance++;
            i--;
            j--;
        } //in terms of edges
        return list1.size() + list2.size() - 2*(lcaDistance);
//        return list1.size() + list2.size() - 2*(lcaDistance);
//in terms of nodes
  }
  public static Node getTail(Node node){
      Node curr = node;
      while(curr.children.size() != 0){
          curr = curr.children.get(0);
      }
      return curr;
  }

  public static void linearize(Node node){
      for(Node child : node.children)
          linearize(child);
      for(int i = node.children.size() - 2; i >= 0; i--){
          Node tail = getTail(node.children.get(i));
          tail.children.add(node.children.get(i+1));
          node.children.remove(i+1);
      }
  }
  static int ceil;
  static int floor;
  public static void ceilAndFloor(Node node, int data) {
    if(node.data > data)
        ceil = Math.min(ceil, node.data);
    if(node.data < data)
        floor = Math.max(floor, node.data);
        
    for(Node child : node.children){
        ceilAndFloor(child, data);
    }
  }
  public static int kthLargest_(Node node, int bound){
      int maxLessThanBound = -(int)1e9;
      for(Node child : node.children){
          int recAns = kthLargest_(child, bound);
          maxLessThanBound = Math.max(maxLessThanBound, recAns);
      }
      if(node.data < bound){
          maxLessThanBound = Math.max(maxLessThanBound, node.data);
      }
      return maxLessThanBound;
  }

  public static int kthLargest(Node node, int k){
      int bound = (int)1e9;
      while(k-- > 0){
          bound  =kthLargest_(node,bound);
      }
      return bound;
  }

  public static boolean areSimilar(Node n1, Node n2) {
    if(n1.children.size() != n2.children.size()) return false;
    
    int n = n1.children.size();
    for(int i = 0; i < n; i++){
        Node c1 = n1.children.get(i);
        Node c2 = n2.children.get(i);
        
        if(!areSimilar(c1,c2)) return false;
    }
    return true;
  }

  public static boolean areMirror(Node n1, Node n2) {
    if(n1.children.size() != n2.children.size()) return false;
//    if(n1.children.size() != n2.children.size() || n1.data != n2.data) //when u have to check values also

    int n = n1.children.size();
    for(int i = 0, j = n - 1; i < n; i++, j--){
        Node c1 = n1.children.get(i);
        Node c2 = n2.children.get(j);
        
        if(!areMirror(c1,c2)) return false;
    }
    return true;
  }

  public static void display(Node node){
      System.out.print(node.data + " -> ");
      for(Node child : node.childs){
          System.out.print(children.data + ", ");
      }
      System.out.println();

      for(Node child : node.childs)
          display(child);
  }