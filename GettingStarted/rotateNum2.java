import java.util.*;
   
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
       public static int rotateDigits(int n, int k){
           int len= countDigits(n);
           k %= len;
           if(k<0) k = (k + len) % len;
           int mul=1, div=1;
           for(int i=1; i<=len; i++){
               if(i<=k) div *= 10;
               else mul *= 10;
               
           }
           int A = n/div;
           int B = n%div;
           return (B * mul) + A;
           
       }
       public static void main(String[] args) {
     // write your code here 
     int n = scn.nextInt();
     int k = scn.nextInt();
     System.out.println(rotateDigits(n,k));
    }
   }