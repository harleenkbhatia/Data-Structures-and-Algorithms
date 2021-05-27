import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = scn.nextInt();
        int S = scn.nextInt();
        System.out.println(findTargetSumWays(nums, S, 0));
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as an integer array and an integer
    // It should return the required output

    public static int findTargetSumWays(int[] nums, int S, int idx) {
        if (idx == nums.length) {
            return S == 0 ? 1 : 0;
        }
        int count = 0;
        count += findTargetSumWays(nums, S - nums[idx], idx + 1);
        count += findTargetSumWays(nums, S - (-nums[idx]), idx + 1);
        return count;
    }
}