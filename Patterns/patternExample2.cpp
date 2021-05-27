import java.util.Scanner;
public class printExample{
    public static void patternExample(int row){
        for(int i=1; i<=row; i++){
        for(int j=1; j<=row; j++){
            int p=row+1;
            if(i+j == p-2||i+j==p+2||i+j==p){
                System.out.print("*\t");
            }
            else{
                System.out.print("\t");
            }
        }
        System.out.println();
        }
    }
    public static void Main(String[] args){
        Scanner scn= new Scanner(System.in);
        int row= scn.nextInt();
        patternExample(row);
    }
}