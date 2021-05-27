public static class basicFunction{
    public static class Node{
        int data = 0; 
        Node left = null;
        Node right = null;

        Node(int data){
            this.data = data;
        }
    }
    public static Node add(Node node, int data) {
        Node curr = node;
      
        if(curr == null) return new Node(data, null, null);
      
        else if(curr.data < data) curr.right = add(curr.right, data);
      
        else if(curr.data > data) curr.left = add(curr.left, data);
      
        else{
        }
        return curr;
    }
        public static Node addData_Itr(Node node, int data) {
        if (node == null)
            return new Node(data);

        Node curr = node;
        Node dNode = new Node(data);
        while (true) {
            if (curr.data == data)
                break;
            else if (curr.data < data) {
                if (curr.right != null)
                    curr = curr.right;
                else {
                    curr.right = dNode;
                    break;
                }
            } else {
                if (curr.left != null)
                    curr = curr.left;
                else {
                    curr.left = dNode;
                    break;
                }
            }
        }

        return node;
    }
    
    public static Node LCA(Node node, int p, int q){
        Node curr = node;
        while(curr!=null){
            if(curr.data < p && curr.data < q) 
                curr = curr.right;
            else if(curr.data > p && curr.data > q) 
                curr = curr.left;
            else
                return (find(curr, p) && find(curr, q)) ? curr : null;
        }
        return null;
    }
    public static void pir(Node node, int d1, int d2) {
        if(node == null) return;
       
        else if(d1 > node.data && d2 > node.data) pir(node.right, d1, d2);
        else if(d1 < node.data && d2 < node.data) pir(node.left, d1, d2);
        else{
            pir(node.left, d1, d2);
            System.out.println(node.data);
            pir(node.right, d1, d2);
        }
    }
    public static int maximum(Node node){
        Node curr = node;
        while(curr.right != null) {
            curr = curr.right;
        }
        return curr.data;
    }
    public static Node removeNode(Node node, int data) {
        if(node == null) return null;
      
        if(node.data < data) 
          node.right = removeNode(node.right, data);
        else if(node.data > data)
          node.left = removeNode(node.left, data);
        else{
          if(node.right == null || node.left == null)
              return node.left != null ? node.left : node.right;
          int maxData = maximum(node.left);
          node.data = maxData;
          node.left = removeNode(node.left, maxData);
    }
      return node;
  }
}