class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnt =0;
        int el = 0;

        for(int i=0;i<n;i++){
            if(cnt == 0){
                cnt = 1;
                el = nums[i];
            }
            else if(nums[i] == el){
                cnt ++;
            }
            else{
                cnt--;
            }
        }

        //cnt the majority element
        int count =0;
        for(int i=0;i<n;i++){
            if(nums[i] == el) count++;
        }
        if(count > n/2) return el;

        return -1;
    }
}