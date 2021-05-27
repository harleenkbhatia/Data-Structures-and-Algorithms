import java.util.*;
    
    public class Main{
        
        public static Scanner scn = new Scanner(System.in);
        public static int CountDigits(int n){
         int num = n;
         int count =0;
       while(num>0){
           
  
           num /= 10;
           count++;
       }  
    return count;
}
    public static void printDigits(int n){
        int num = n;
        int len = CountDigits(num);
        int div =1;
        while(len-- > 1){
            div *= 10;
        }
        while(div != 0){
            System.out.println(n/div);
            n = n%div;
            div /= 10;
        }
        
    }
    
    public static void main(String[] args) {
      // write your code here 
      int n = scn.nextInt();
      printDigits(n);
     }
    }