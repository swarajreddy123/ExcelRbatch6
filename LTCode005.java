import java.util.Arrays;
import java.util.HashMap;

public class LTCode005 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No solution found");
    }

    public static void main(String[] args) {
        LTCode005 solution = new LTCode005();
        
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Test case 1: " + Arrays.toString(solution.twoSum(nums1, target1))); 
        
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("Test case 2: " + Arrays.toString(solution.twoSum(nums2, target2))); 
        
        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println("Test case 3: " + Arrays.toString(solution.twoSum(nums3, target3))); 
    }
}
