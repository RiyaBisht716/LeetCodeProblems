class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int cnt1 = 0;
        int cnt2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;

        for(int i=0;i< n;i++){
            if(cnt1==0 && nums[i]!=ele2){
                cnt1 = 1;
                ele1 = nums[i];

            }else if(cnt2 == 0 && nums[i]!=ele1){
                cnt2 = 1;
                ele2 = nums[i];
            }else if(ele1 == nums[i]) cnt1++;
            else if (ele2 == nums[i]) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> ls = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;
        for(int i=0;i<n ;i++){
            if(ele1 == nums[i]) cnt1++;
            if(ele2 == nums[i]) cnt2++;
        }
        int mini = (int) (n/3)+1;
        if(cnt1 >=mini) ls.add(ele1);
        if(cnt2 >=mini) ls.add(ele2);

        return ls;
        


        
    }
}