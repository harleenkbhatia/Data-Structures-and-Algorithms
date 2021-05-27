//SET S SET A SET B
//equi set is a set in which A U B = S, A INTERSECTION B = FI, SUMMATION A = SUMMATION B
//way-up
public class equiSet{
    public static int equiSet(int[] arr, int idx, int sum1, int sum2, String set1, String set2){
        if(idx==arr.length) {
            if(sum1==sum2){
            System.out.println(set1 + " = " + set2);
            return 1;
        }
        return 0;
    }
    int count = 0;
    count += equiSet(arr, idx+1, sum1 + arr[idx], sum2, set1 + arr[idx] + " ", set2);
    count += equiSet(arr, idx+1, sum1, sum2 + arr[idx], set1 , set2+ arr[idx] + " ");

    return count;
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
       // System.out.println(equiSet(arr, 0,0,0,"","")); // giving us mirror image sets too
        System.out.println(equiSet(arr, 1, arr[0], 0, arr[0] + " ", ""));
        //removes the mirror images by fixing 1 element in 1 string sum1 i.e. 0th index ko fix krdia 
        //ans idx 1 se start krdia
    }
}
