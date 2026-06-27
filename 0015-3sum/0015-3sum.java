class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set= new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            HashSet<Integer> seen = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third=-(nums[i]+nums[j]);
                if(seen.contains(third)){
                    List<Integer> temp= new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);
                    Collections.sort(temp);
                    set.add(temp);
                }
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }
}

