import java.util.Scanner;
public class printTable{
public static Scanner scn = new Scanner(System.in);

public static void printTable(int n){
    for(int i=1; i<=10; i++){
    System.out.println(n + " X " + i + " = " + n * i);
    }
    }
public static void printTableTillM(int m){
    for(int i=1; i<=m; i++){
    printTable(i);
    System.out.println();
    }
    }
public static void main(String[] args){
    int n = scn.nextInt();
    printTableTillM(n);
    }
                    
}
