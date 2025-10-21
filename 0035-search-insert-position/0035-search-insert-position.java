class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low=0;
        int high = nums.length-1;
        int result = nums.length;//agar target value sabse badi hain to last mai add ho jayegi

        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] >= target){
                result = mid;
                high= mid-1;
            }
            else{
                low= mid+1;
            }

        }
        
        return result;
    }
}