import java.util.Arrays;
import java.util.Scanner;

public class arrayBasics{
    public static Scanner scn = new Scanner(System.in);
    public static void test1(){
        int n= scn.nextInt();
        int[] arr=new int[n];

        for(int i=0; i<arr.length;i++){
            arr[i]= scn.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    
    }
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val: a) {
            //for each loop
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }
    public static void test2(){
        int[] arr = new int[10];
        Arrays.fill(arr,8);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        test1();
    }
}
