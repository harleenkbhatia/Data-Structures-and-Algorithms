import java.util.Scanner;
public class Main{
        
        public static Scanner scn = new Scanner(System.in);
        public static void revNum(int n){
            int num=n;
            while(num>0){
                int res = num%10;
                System.out.println(res);
                num /= 10;
                }
                }
public static int main(String[] args){
    int n = scn.nextInt();
    revNum(n);
    //write your code here
    
}