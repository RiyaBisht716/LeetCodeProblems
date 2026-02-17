class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        long sum = 0;
        for(int num: nums){
            sum+= num;  
        }
        int cnt = 0;

        for(int i=0;i<n-1;i++){
            sum -= nums[i];
            int rightCnt = n-i-1;

            if((long) nums[i] * rightCnt > sum){
                cnt++;
            }
        }
        return cnt;
        
    }
}