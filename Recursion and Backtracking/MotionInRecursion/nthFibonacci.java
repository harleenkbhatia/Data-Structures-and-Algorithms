import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        System.out.print(fibo(n));
    }

    public static int fibo(int n){
        if(n<=2) return n;
        return fibo(n-1)+fibo(n-2);
    }

}
import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
  public static int fibo(int n){
        if(n<=2) return n;
        return fibo(n-1)+fibo(n-2);
    }
  public static void fiboSeq(int n){
    for(int i = 1; i<=n; i++) System.out.println(fibo(i));
  }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        fiboSeq(n);
    }
}