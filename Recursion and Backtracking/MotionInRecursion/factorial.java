import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        System.out.print(factorial(n));
    }

    public static int factorial(int n) {
        //if(n==0) return 1;
        //int recAns= factorial(n-1);
        //return recAns*n;
    
        return n==0 ? 1 : factorial(n-1)*n;
    }

}