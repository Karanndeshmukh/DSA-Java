package Arrays;
import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(findMissingNumber(arr));
    }

    public static int findMissingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}

