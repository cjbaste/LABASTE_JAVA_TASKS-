import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        for (int i = 0; i < nums.length - 1; i++) {
            
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                   
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

         int[] result1 = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.print("Test Case 1: [2, 7, 11, 15], Target: 9 -> ");
        if (result1.length == 2) {
            System.out.println(Arrays.toString(result1));
        } else {
            System.out.println("Target not found");
        }

        int[] result2 = solution.twoSum(new int[]{3, 2, 4}, 6);
        System.out.print("Test Case 2: [3, 2, 4], Target: 6 -> ");
        if (result2.length == 2) {
            System.out.println(Arrays.toString(result2));
        } else {
            System.out.println("Target not found");
        }

}
}
