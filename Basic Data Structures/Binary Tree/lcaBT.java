import java.util.ArrayList;
public class lcaBT {

    public static class Node {
        int data = 0;
        Node left = null;
        Node right = null;

        Node(int data) {
            this.data = data;
        }
    }
//leetcode 236
    public static boolean rootToNodePath(Node root, int data, ArrayList<Node> ans){
        if(root == null) return false;
        boolean res = (root.data == data) || rootToNodePath(root.left, data, ans) 
            || rootToNodePath(root.right, data, ans);
        if(res){
            ans.add(root);
        return res;
    }
    public static Node lcaBT(Node node, int p, int q){
        ArrayList <Node> list1 = new ArrayList<>();
        ArrayList <Node> list2 = new ArrayList<>();
        
        rootToNodePath(node, p, list1);
        rootToNodePath(node, q, list2);
        
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
        return lca;
    }