public class check {
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void downHeapify(int[] nums, int pi, int li) {
        int maxIdx = pi;
        int lci = 2 * pi + 1;
        int rci = 2 * pi + 2;

        if (lci <= li && nums[lci] > nums[maxIdx])
            maxIdx = lci;
        if (rci <= li && nums[rci] > nums[maxIdx])
            maxIdx = rci;

        if (pi != maxIdx) {
            swap(nums, pi, maxIdx);
            downHeapify(nums, maxIdx, li);
        }
    }
    public static int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        for (int i = n - 1; i >= 0; i--)
            downHeapify(nums, i, n - 1);

        int li = n - 1;
        while (k > 1) {
            swap(nums, 0, li--);
            downHeapify(nums, 0, li);
            k--;
        }

        return nums[0];
    }
    public static void display(int[] nums){
        for(int ele : nums)
            System.out.print(ele + " ");
        System.out.println();
    }
    public static void main(String[] args){
        int[] nums = {10, 20, 30, -2, -3, -4, 5, 6, 7, 8, 9, 22, 11, 13};
        int n = nums.length;
        for(int i = n-1; i >=0; i--){
            downHeapify(nums, i, n-1);
        }
        int li = n-1;
        while(li >= 0){
            swap(nums, 0, li--);
            downHeapify(nums, 0, li);
        }
        display(nums);
        System.out.println(findKthLargest(nums, 3));
    }
}