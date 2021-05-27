import java.util.ArrayList;
public class treeTraversal{
    public static class Node{
        int data = 0;
        Node left = null;
        Node rigt = null;

        Node(int data){
            this.data = data;
        }
    }
//Traversal of Tree

public static void preOrderTraversal(Node root, ArrayList<Integer> ans){
    if(root == null) return;

    ans.add(root.data);
    preOrderTraversal(root.left, ans);
    preOrderTraversal(root.right, ans);
}
public static void inOrderTraversal(Node root, ArrayList<Integer> ans){
    if(root == null) return;

    preOrderTraversal(root.left, ans);
    ans.add(root.data);
    preOrderTraversal(root.right, ans);
}
public static void postOrderTraversal(Node root, ArrayList<Integer> ans){
    if(root == null) return;

    preOrderTraversal(root.left, ans);
    preOrderTraversal(root.right, ans);
    ans.add(root.data);

}
public static void traversal(Node root){
    ArrayList<Integer> ans = new ArrayList<>();
    preOrderTraversal(root, ans);
    //inOrderTraversal(root, ans);
    //postOrderTraversal(root, ans);
}

}
