public static ArrayList<Integer> ans= new ArrayList<>();
public static boolean nodeToRootPath(Node root, int data){
      
        if(root == null) return false;
        boolean res = (root.data == data) || nodeToRootPath(root.left, data) 
            || nodeToRootPath(root.right, data);
        if(res){
            ans.add(root.data);
        }
        return res;
  }
  //main
nodeToRootPath(root, data);
System.out.println(ans);

public static void printKLevelsDown(Node root, int k){
      if(root == null || k < 0) return;

    if(k == 0){
        System.out.println(root.data);
        return;
    }
    printKLevelsDown(root.left, k-1);
    printKLevelsDown(root.right, k-1);
  }
