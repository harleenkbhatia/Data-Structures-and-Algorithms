import java.util.Scanner;

public class Main{
    public static Scanner scn = new Scanner(System.in);
    public static int countDigits(int n){
    int count=0;
    int num=n;
    while(num!=0){
        num/=10;
        count++;
    }
    return count;
}

public static void main(String[] args){
    int n = scn.nextInt();
    System.out.println(countDigits(n));
    
}
}