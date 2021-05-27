import java.util.Scanner;
public class printExample{
    public static void patternExample(int row){
        for(int i=1; i<=row; i++){
        for(int j=1; j<=row; j++){
            
            if(i-j == 2||j-i==2||i-j==0){
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
