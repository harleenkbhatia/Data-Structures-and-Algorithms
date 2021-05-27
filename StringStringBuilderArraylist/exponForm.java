import java.io.*;
import java.util.*;

public class exponForm {
    public static Scanner scn = new Scanner(System.in);

    public static boolean isPrime(int n)
    { 
        for(int i = 2 ; i * i <= n ; i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }

	public static ArrayList<Integer> allPrimes(int n){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=2; i*i <= n; i++){
            if(isPrime(i)) list.add(i);

        }
        return list;
	}
    public static void powerForm(int num,ArrayList<Integer> list){
        System.out.print(num+" --> ");
        int idx = 0;
        while(idx<list.size() && num > 1){
            int count=0;
            while(num % list.get(idx)==0 && num > 1){
                num /= list.get(idx);
                count++;
            }
            if(count > 0) System.out.print(list.get(idx) + "^" + count + " ");
            idx++;
        }
        if(num>1) System.out.print((num) + "^" + 1 + " ");
        System.out.println();
    }
    public static void exponForm(int[] query){
        ArrayList<Integer> list=allPrimes(1000000);
        //System.out.println(list);
        for(int ele : query){
            powerForm(ele,list);
        }
    }
	public static void main(String[] args) {
        int[] arr= {22222,128,129000,392,31,11,97,55,39,23};
		exponForm(arr);
	}

}