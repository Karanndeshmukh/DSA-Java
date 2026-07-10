/*class Solution {
    public int singleNonDuplicate(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=nums[i]^xor;
        }
        return xor;

    }
}*/
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        
        if (j == 0) {
            return nums[0];
        }
        
        while (i <= j) {
            int mid = i + (j - i) / 2;
            
            boolean leftCheck = (mid == 0 || nums[mid] != nums[mid - 1]);
            boolean rightCheck = (mid == nums.length - 1 || nums[mid] != nums[mid + 1]);
            
            if (leftCheck && rightCheck) {
                return nums[mid];
            }
            
            // Determine which half to eliminate based on index parity
            // If mid is even, its partner should be at mid + 1
            // If mid is odd, its partner should be at mid - 1
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || 
                (mid % 2 != 0 && nums[mid] == nums[mid - 1])) {
                // We are in the left half before the single element -> search right
                i = mid + 1;
            } else {
                // We are in the right half after the single element -> search left
                j = mid - 1;
            }
        }
        
        return -1;
    }
}