class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length-1;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }

        }
        return false;

        
    }
}