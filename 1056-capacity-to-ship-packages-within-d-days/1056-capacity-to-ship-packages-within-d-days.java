class Solution {
    public int DaysRequired(int [] nums,int capacity){
        int n = nums.length;
        int days=1;
        int load = 0;
        for(int i =0;i< n;i++){
            if(load + nums[i] >capacity){ // load+nums[i] small ya equal hona chahiye
                days = days +1;//next day pe jayenge
                load = nums[i];
            }
            else{
                load+= nums[i];//add weight in load
            }
           
        }
         return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        //max element
        int maxValue = Integer.MIN_VALUE;
        for(int num:weights){
            maxValue = Math.max(maxValue,num);

        }
        //calculating sum
        int sum=0;
        for(int s: weights){
            sum+= s;
        }
        int low = maxValue;
        int high = sum;
        while(low<=high){
            int mid = low+ (high-low)/2;
            int noOfDays = DaysRequired(weights,mid);
            if(noOfDays<= days){
                high = mid-1;//possible answer check for smaller one
            }
            else{
                //check for larger one;
                low = mid+1; 
            }
        }
        return low;

        
    }
}