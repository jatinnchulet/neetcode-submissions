class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        boolean a = false;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            
        }
        int b= set.size();
        if(b < nums.length){
            a=true;
        }
        return a;
        
    }
}