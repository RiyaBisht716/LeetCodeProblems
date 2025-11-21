class Solution {
    public int jump(int[] nums) {
        int jump =0;//count the no of jump
        int end =0;//it will indicate current boundary
        int far =0;//last index where we can jump 
       
        for(int i=0;i<nums.length-1;i++){
            far = Math.max(far,i + nums[i]);
            if(i==end) {
                jump++;
                end = far;
            }
        }
        return jump;
    }
}