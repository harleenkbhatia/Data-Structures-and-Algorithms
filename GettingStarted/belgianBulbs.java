import java.util.Scanner;
  
  public class Main{
      public static Scanner scn= new Scanner(System.in);
    public static void belgianBulbs(int n){
    for(int i=1; i * i <= n; i++){
        System.out.println(i*i);
    }
    }
  public static void main(String[] args) {
    int n= scn.nextInt();
        belgianBulbs(n); 
   }
  }