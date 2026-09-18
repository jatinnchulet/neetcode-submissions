class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean a = false;
        for(int i=1;i<nums.length;i++){
            Arrays.sort(nums);
            if(nums[i]==nums[i-1]){
                a=true;
                break;
            }
        }
        return a;
    }
}