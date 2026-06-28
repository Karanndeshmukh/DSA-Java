class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int value=Math.abs(nums[i]);
            int pos=value-1;
            if(nums[pos]>0){
                nums[pos]=-nums[pos];
            }else{
                list.add(Math.abs(nums[i]));
            }
        }
        return list;
    }
}
/*
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> freq= new HashMap<>();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(freq.get(nums[i])>1){
                set.add(nums[i]);
            }
        }
        return new ArrayList<>(set);
    }
}
*/