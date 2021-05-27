public class treeTraversal{
    public static class Node{
        int data = 0;
        Node left = null;
        Node rigt = null;

        Node(int data){
            this.data = data;
        }
    }
//Basic Functions
    public static int size(Node root){
        if(root == null) return 0;

        int left = size(root.left);
        int right = size(root.right);

        return left + right + 1;
    }
    public static int height(Node root){
        if(root == null) return -1;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static int heightInTermsOfNodes(Node root){
        if(root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static int maximum(Node root){
        if(root == null) return (int) -1e8;

        int leftMax = maximum(root.left);
        int rightMax = maximum(root.right);

        return Math.max(Math.max(leftMax, rightMax), root.data);
    }
    public static int minimum(Node root){
        if(root == null) return (int) 1e8;

        int leftMin = minimum(root.left);
        int rightMin = minimum(root.right);

        return Math.min(Math.min(leftMin, rightMin), root.data);   
    }
    public static int sum(Node root){
        if (root == null)  return 0;

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        return leftSum + root.data + rightSum;
    }
    public static boolean findData(Node root, int data){
        if(root == null) return false;
        
        //boolean res = root.data == data;
        //return res || findData(root.left, data) || findData(root.right, data);
        
        return root.data == data || findData(root.left, data) || findData(root.right, data);
    }
}