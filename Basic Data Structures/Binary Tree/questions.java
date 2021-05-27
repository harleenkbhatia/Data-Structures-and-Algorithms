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
    public static boolean rootToNodePath(Node root, int data, Arraylist<Integer> ans){
        if(root == null) return false;
        boolean res = (root.data == data) || rootToNodePath(root.left, data, ans) 
            || rootToNodePath(root.right, data, ans);
        if(res){
            ans.add(root);
            return res;
        }
    }
    public static void printAtDepthK(Node root, int k, Arraylist<Integer> ans){
        if(root == null || k < 0) return;
        if(k == 0){
            ans.add(root.data);
            return;
        }
        printAtDepthK(root.left, k-1, ans);
        printAtDepthK(root.right, k-1, ans);
    }
    public ArrayList<Integer> distanceK(Node root, Node target, int k) {
        ArrayList<Node> path = new ArrayList<>();
        rootToNodePath(root, target.data, path);

        Node block = null;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < path.size(); i++) {
            printAtDepthK(path.get(i), block, k - i, ans);
            block = path.get(i);
        }

        return ans;
    }

    public static void printSingleChildNodes(Node node, Node parent) {
        if (node == null)
            return;
        if (parent != null && (parent.left == null || parent.right == null)) {
            System.out.println(node.data);
        }

        printSingleChildNodes(node.left, node);
        printSingleChildNodes(node.right, node);
    }

    public static Node removeLeaves(Node node){
        if(node == null) return null;
        if(node.left == null && node.right == null) return null;
        
        node.left = removeLeaves(node.left);
        node.right = removeLeaves(node.right);
        return node; 
    }

    public static void removeLeaves(Node node, Node parent){
        if (node == null)
            return;
        if(node.left == null && node.right == null){
            if(parent.left == node) parent.left = null;
            else parent.right = null;
            
            return;
        }
        removeLeaves(node.left, node);
        removeLeaves(node.right, node);
        
    }
    //for cases when only root i.e. a single element is given
    public static Node removeLeaves(Node node){
        if(node.left == null && node.right == null){
            return null;
        }
        removeLeaves(node,null);
        return node;
    }
    //main
    Node root = construct(arr);
    root = removeLeaves(root);
    display(root);

//========================================================================================
    public static Node prev = null;
    public static boolean isBST(Node node){
      if(node == null) return true;
      
      boolean leftRes = isBST(node.left);
      if(!leftRes) return false;
      if(prev != null && prev.data > node.data) return false;
      prev = node;
      
      boolean rightRes = isBST(node.right);
      if(!rightRes) return false;
      
      return true;
      }

      //main
      System.out.println(isBST(root));

      public class isBSTSolPair {
        int maxEle = -(int) 1e8;
        int minEle = (int) 1e8;
        boolean isBST = true;
    }

    public isBSTSolPair isBST_(Node node) {
        if (node == null) {
            // isBSTSolPair base = new isBSTSolPair();
            // return base;

            return new isBSTSolPair();
        }

        isBSTSolPair left = isBST_(node.left);
        isBSTSolPair right = isBST_(node.right);

        isBSTSolPair myRes = new isBSTSolPair();
        myRes.isBST = false;
        if (left.isBST && right.isBST && left.maxEle < node.data && node.data < right.minEle) {
            myRes.isBST = true;
            myRes.maxEle = Math.max(node.data, right.maxEle);
            myRes.minEle = Math.min(node.data, left.minEle);
        }

        return myRes;
    }

//isBal=====================================================================================================

    public static class isBalPair {
        int height = -1;
        boolean balanceTree = true;
    }

    public static isBalPair isBal_(Node node) {
        if (node == null)
            return new isBalPair();

        isBalPair left = isBal_(node.left);
        if (!left.balanceTree)
            return left;

        isBalPair right = isBal_(node.right);
        if (!right.balanceTree)
            return right;
        

        isBalPair myRes = new isBalPair();
        myRes.balanceTree = false;
        if (left.balanceTree && right.balanceTree && Math.abs(left.height - right.height) <= 1) {
            myRes.balanceTree = true;
            myRes.height = Math.max(left.height, right.height) + 1;
        }

        return myRes;
    }

    public static boolean isBal(Node node) {
        isBalPair ans = isBal_(node);
        return ans.balanceTree;
    }
//largest BST======================================================================================
    public static class isBSTSolPair {
        int maxEle = -(int) 1e8;
        int minEle = (int) 1e8;
        boolean isBST = true;

        int largestBSTSize = 0;
        Node largestBSTNode = null;
    }
    public static isBSTSolPair allsolution(Node node) {
        if (node == null) {
            return new isBSTSolPair();
        }

        isBSTSolPair left = allsolution(node.left);
        isBSTSolPair right = allsolution(node.right);

        isBSTSolPair ans = new isBSTSolPair();

        ans.isBST = left.isBST && right.isBST && left.maxEle < node.data && node.data < right.minEle;
        

        ans.maxEle = Math.max(node.data, right.maxEle);
        ans.minEle = Math.min(node.data, left.minEle);

        if (ans.isBST) {
            ans.largestBSTNode = node;
            ans.largestBSTSize += left.largestBSTSize + right.largestBSTSize + 1;
        } else {
            if (left.largestBSTSize > right.largestBSTSize) {
                ans.largestBSTNode = left.largestBSTNode;
                ans.largestBSTSize = left.largestBSTSize;
            } else {
                ans.largestBSTNode = right.largestBSTNode;
                ans.largestBSTSize = right.largestBSTSize;
            }
        }

        return ans;
    }
  public static void largestBST(Node node){
      isBSTSolPair myAns = allsolution(node);
      Node rootlargestBSTNode = myAns.largestBSTNode;
      System.out.println(rootlargestBSTNode.data+"@"+myAns.largestBSTSize);
  }
  //main 
  largestBST(root);
}

//allSolution
    public static class isBSTSolPair {
        int maxEle = -(int) 1e8;
        int minEle = (int) 1e8;
        boolean isBST = true;

        boolean isBal = true;
        int height = -1;

        int largestBSTSize = 0;
        Node largestBSTNode = null;

        int totalNoOfBST = 0;
    }
    public static isBSTSolPair allsolution(Node node) {
        if (node == null) {
            return new isBSTSolPair();
        }

        isBSTSolPair left = allsolution(node.left);
        isBSTSolPair right = allsolution(node.right);

        isBSTSolPair ans = new isBSTSolPair();

        ans.isBST = left.isBST && right.isBST && left.maxEle < node.data && node.data < right.minEle;
        ans.isBal = left.isBal && right.isBal && Math.abs(left.height - right.height) <= 1;

        ans.maxEle = Math.max(node.data, right.maxEle);
        ans.minEle = Math.min(node.data, left.minEle);
        ans.height = Math.max(left.height, right.height) + 1;

        ans.totalNoOfBST = left.totalNoOfBST + right.totalNoOfBST + (ans.isBST ? 1 : 0);

        if (ans.isBST) {
            ans.largestBSTNode = node;
            ans.largestBSTSize += left.largestBSTSize + right.largestBSTSize + 1;
        } else {
            if (left.largestBSTSize > right.largestBSTSize) {
                ans.largestBSTNode = left.largestBSTNode;
                ans.largestBSTSize = left.largestBSTSize;
            } else {
                ans.largestBSTNode = right.largestBSTNode;
                ans.largestBSTSize = right.largestBSTSize;
            }
        }

        return ans;
    }

//Tilt//////////////////////////////////////////////////////////

    public static class tiltPair{
      int sum = 0;
      int tilt = 0;
    }
    public static tiltPair Tilt(Node node){
      if (node == null) {
            return new tiltPair();
      }
      tiltPair left = Tilt(node.left);
      tiltPair right = Tilt(node.right);
      
      tiltPair ans = new tiltPair();
      
      ans.sum = left.sum + right.sum + node.data;
      int localTilt = Math.abs(left.sum - right.sum);
      ans.tilt = left.tilt + right.tilt + localTilt;
      return ans;
    }
    public static int tiltBT(Node node){
      tiltPair res = Tilt(node);
      return res.tilt;
    }

    public static void inOrder(Node node, ArrayList<Integer> list) {
        if (node == null)
            return;

        inOrder(node.left, list);
        list.add(node.data);
        inOrder(node.right, list);

    }

    public static void targetSum(Node node, int tar) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(node, list);

        int i = 0, j = list.size() - 1;
        while (i < j) {
            int sum = list.get(i) + list.get(j);
            if (sum < tar)
                i++;
            else if (sum > tar)
                j--;
            else {
                System.out.println(list.get(i) + " " + list.get(j));
                i++;
                j--;
            }
        }

    }