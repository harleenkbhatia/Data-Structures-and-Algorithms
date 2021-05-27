import java.util.Scanner;
public class oddEven{
public static Scanner scn=new Scanner(System.in);
public static void oddEven(int n){
    if(n%2==0){
        System.out.println(n+" is Even");
        }
    else{
        System.out.println(n+" is Odd");
        }
    }
public static void rangeOddEven(int m){
    for (int i=1; i<=m; i++){
        oddEven(i);
        }
    }
public static void main(String[] args){
    int n = scn.nextInt();
    rangeOddEven(n);
    }
}
