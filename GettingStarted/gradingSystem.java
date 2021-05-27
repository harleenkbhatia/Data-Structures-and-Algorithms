import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // input - don't change this code
      Scanner scn = new Scanner(System.in);
      int marks = scn.nextInt();
      // input - don't change this code
      gradingSystem(marks);
    }
      // code here 
      public static void gradingSystem(int n){
        if(n > 90){
            System.out.print("excellent");
        }
        else if(n > 80 && n <= 90){
            System.out.print("good");
        }
        else if(n > 70 && n <= 80){
            System.out.print("fair");
        }
        else if(n > 60 && n <= 70){
            System.out.print("meets expectations");
        }
        else{
            System.out.print("below par");
        }
     }
  
   }