import java.util.ArrayList;

public class basic{
    public static class Node{
        int data = 0;
        ArrayList<Node> childs = new ArrayList();

        Node(int data){
            this.data = data;
        }
    }
    public static int size(Node node){
        int sz = 0;

        for(Node child : node.childs)
            sz += size(child);
        
        return sz + 1;
    }
    //no.of edges
    public static int height(Node node) {
        int h = -1;
        for(Node child : node.children)
            h = Math.max(h, height(child));
        return h + 1;
    }
    //no.of nodes
    public static int height(Node node) {
        int h = 0;
        for(Node child : node.children)
            h = Math.max(h, height(child));
        return h + 1;
    }
    public static int max(Node node) {
        int maxEle = node.data;
        for(Node child : node.children)
            maxEle = Math.max(maxEle, max(child));
        return maxEle;
    }
    public static int min(Node node){
        int minEle = node.data;
        for(Node child : node.children)
            minEle = Math.min(minEle, min(child));
        return minEle;
    }
    public static boolean find(Node node, int data) {
        boolean res = node.data == data;
        for (Node child : node.childs) {
            res = res || find(child, data);
        }

        return res;
    }
    
}