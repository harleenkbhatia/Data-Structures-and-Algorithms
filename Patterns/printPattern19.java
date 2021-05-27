import java.util.*;

public class Main {
    public static void pattern19(int n){
        int p = (n/2) + 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1){
                    if(j==n || j <= p){
                        System.out.print("*\t");
                    }
                    else System.out.print("\t");
                } 
                else if(i<=n/2){
                    if(j==n||j==p){
                        System.out.print("*\t");
                    }
                    else System.out.print("\t");
                } 
                else if(i==p){
                    System.out.print("*\t");
                }
                else if(i<n){
                    if(j==1 || j==p){
                        System.out.print("*\t");
                    }
                    else System.out.print("\t");
                }
                else{
                    if(j==1||j>=p){
                        System.out.print("*\t");
                    }
                    else System.out.print("\t");
                }
            }
            System.out.println();
        }
}
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row= scn.nextInt();
        // write ur code here
        pattern19(row);

    }
}