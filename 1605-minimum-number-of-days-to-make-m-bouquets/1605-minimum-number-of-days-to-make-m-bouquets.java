class Solution {

    public boolean canMakeBouquet(int[]bloomDay,int day,int m,int k){
        int n =bloomDay.length;
        int cnt =0;
        int noOfB = 0;
        for(int bloom : bloomDay){
            if(bloom <=day){
                cnt++;
                if(cnt==k){
                    noOfB++;
                    cnt =0;
                    if(noOfB>=m) return true;
                }
            }else{
                
                cnt =0;
            }
   
        }
        return false;
        
        
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n =bloomDay.length;
        long val = (long)m*k;//to avoid overflow
        if(val>n) return -1; //not wnough flower to make a bouquet
        // Instead of using stream (slower), find min & max manually
        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;
        for (int bloom : bloomDay) {
            minDay = Math.min(minDay, bloom);
            maxDay = Math.max(maxDay, bloom);
        }
        int low = minDay,high = maxDay;
        int ans =-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(canMakeBouquet(bloomDay,mid,m,k)){
                ans = mid;
                high = mid-1;//look for minimum  days
            } 
            else{
                low = mid +1;//check for more days

            }
           

        }
         return ans;//it will provide the answer as it is cross the high 

    }
}