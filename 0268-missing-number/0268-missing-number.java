class Solution {
    public int missingNumber(int[] nums) {
        int xorsum=0;
        for(int i=0;i<nums.length;i++){
            xorsum=xorsum^nums[i];
        }
        for(int i=0;i<=nums.length;i++){
            xorsum= xorsum ^ i;
        }
        return xorsum;
    }
}