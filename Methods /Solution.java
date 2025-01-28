import java.util.Arrays;
public class FindSingleNumber {

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1]; 
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,3,3,4,4,5,5};
        int single = singleNumber(nums);
        System.out.println("The single number is: " + single); 
    }
}







public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;
        
        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }
        
        return maxCount;
    }
}
