public static class basicFunction{
    public static class Node{
        int data = 0; 
        Node left = null;
        Node right = null;

        Node(int data){
            this.data = data;
        }
    }
    public static Node constructTree(int[] arr, int si, int ei){
        if(si > ei) return null;

        int mid = (si + ei) / 2;
        Node node = new Node(arr[mid]);

        node.left = constructTree(arr, si, mid - 1);
        node.right = constructTree(arr, mid + 1, ei);
        
        return node;
    }
    public static Node constructTree(int[] arr){
        return constructTree(arr, 0, arr.length - 1);
    }
    public static int size(Node node){
        return node == null ? 0 : size(node.left) + size(node.right) + 1;
    }
    public static int height(Node node){
        //int terms of edges
        return node == null ? -1 : Math.max(height(node.left), height(node.right)) + 1;
        //in terms of nodes
        //return node == null ? 0 : Math.max(height(node.left), height(node.right)) + 1;
    }
    public static int sum(Node node) {
        if (node == null)  return 0;

        int leftSum = sum(node.left);
        int rightSum = sum(node.right);

        return leftSum + node.data + rightSum;
    }
    public static int maximum(Node node){
        Node curr = node;
        while(curr.right != null) {
            curr = curr.right;
        }
        return curr.data;
    }
    public static int maximumRec(Node node){
        if(node.right == null){
            return node.data;
        }
        return maximumRec(node.right);
    }
    public static int minimum(Node node){
        Node curr = node;
        while(curr.left != null) {
            curr = curr.left;
        }
        return curr.data;
    }
    public static boolean find(Node node, int data){
        Node curr = node;

        while(curr != null){
            if(curr.data == data) return true;
            else if(curr.data < data) curr = curr.right;
            else curr = curr.left;
        }
        return false;
    }
    public static int lca(Node node, int p, int q) {
        Node curr = node;
        while(curr!=null){
            if(curr.data < p && curr.data < q) 
                curr = curr.right;
            else if(curr.data > p && curr.data > q) 
                curr = curr.left;
            else 
               return curr.data;
        }
        return (find(curr, p) && find(curr, q)) ? curr.data : null; //when not gauranteed that p & q will exist
        //in the bst or not 
  }
    
}