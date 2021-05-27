import java.util.*;

public class Main{
    public static void pattern10(int row){
        int os = row / 2;
        int is = -1;
        
        for(int r=1; r<=row; r++){
            //System.out.println(os+" , "+ is);
            
            for(int csp=1; csp<=os; csp++){
                System.out.print("\t");
            }
            
            System.out.print("*\t");
            
            for(int csp=1; csp<=is; csp++){
                System.out.print("\t");
            }
            if(is != -1) System.out.print("*\t");
            
            if(r <= row/2){
                os--;
                is += 2;
            }
            else{
                os++;
                is -= 2;
            }
            System.out.println();
        }
    }

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int row= scn.nextInt();
     pattern10(row);

 }
}