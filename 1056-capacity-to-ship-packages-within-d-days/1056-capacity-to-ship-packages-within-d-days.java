class Solution {
    public int DaysRequired(int [] weights,int capacity){
        int n = weights.length;
        int days=1;
        int load = 0;
        for(int w :weights){
            if(load + w  >capacity){ // load+nums[i] small ya equal hona chahiye
                days++;//next day pe jayenge
                load = w;
            }
            else{
                load+= w;//add weight in load
            }
           
        }
         return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        //max element and sum
        int max = 0;
        int sum=0;
          for (int w : weights) {
            sum += w;
            if (w > max) max = w;
        }

        int low = max;
        int high = sum;
        while(low<=high){
            int mid = low+ (high-low)/2;
            int requiredDays = DaysRequired(weights,mid);
            if(requiredDays<= days){
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