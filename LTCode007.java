public class LTCode007 {
    
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        LTCode007 solution = new LTCode007();        
        int[] nums1 = {1, 1, 2};
        int newLength1 = solution.removeDuplicates(nums1);
        printArray(nums1, newLength1);
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength2 = solution.removeDuplicates(nums2);
        printArray(nums2, newLength2); 
        int[] nums3 = {};
        int newLength3 = solution.removeDuplicates(nums3);
        printArray(nums3, newLength3);
    }
    private static void printArray(int[] array, int length) {
        System.out.print("[");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i]);
            if (i < length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
