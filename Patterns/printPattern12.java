import java.util.*;

public class Main {

    public static Scanner scn = new Scanner(System.in);
    
    public static void pattern12(int row){
        int nd=1, a=0, b=1;
        for(int r=1; r<=row; r++){
            for(int cd=1; cd<=nd; cd++){
                System.out.print(a+"\t");
                int sum=a+b;
                a=b;
                b=sum;
            }
            nd++;
            System.out.println();
            
        }
    }
    

    public static void main(String[] args) {
        
        int r= scn.nextInt();
        pattern12(r);
        // write ur code here

    }
}