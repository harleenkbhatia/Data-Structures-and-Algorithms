import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        System.out.print(tribo(n));
    }

    public static int tribo(int n){
        if(n<=2) return n==2 ? 1 : n;
        return tribo(n-1)+tribo(n-2)+tribo(n-3);
    }

}