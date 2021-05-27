import java.util.Scanner;  
  public class Main{
      public static Scanner scn = new Scanner(System.in);
      public static boolean isPythagorean(int a, int b, int c){
          if((a*a + b*b == c*c) || (a*a + c*c == b*b) || (c*c + b*b == a*a)) return true;
          return false;
          
      }
  public static void main(String[] args) {
    int a= scn.nextInt();
    int b= scn.nextInt();
    int c= scn.nextInt();
    System.out.print(isPythagorean(a,b,c));
   }
  } 