class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;// it will give same no xor 0 so in last it will return the single no which appear only once
        for(int i=0;i<nums.length;i++){
            xor= xor^ nums[i];
        }
        return xor;
       
        
    }
}