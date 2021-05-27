import java.util.*;
  
  public class Main{
      
      public static Scanner scn = new Scanner(System.in);
      
      public static void printFibo(int n){
      int a=0, b=1;
      for(int i=1; i<=n; i++){
          System.out.println(a);
          int sum=a+b;
          a=b;
          b=sum;
      }
  }
  public static void main(String[] args) {
      // write your code here
      int n = scn.nextInt();
      printFibo(n);
   }
  }