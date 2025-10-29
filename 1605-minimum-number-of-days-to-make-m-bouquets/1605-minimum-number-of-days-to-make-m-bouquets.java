class Solution {

    public boolean isPossible(int[]arr,int day,int m,int k){
        int n =arr.length;
        int cnt =0;
        int noOfB = 0;
        for(int i =0;i<n;i++){
            if(arr[i]<=day){
                cnt++;
                if(cnt==k){
                    noOfB++;//bouquet can be make
                    cnt =0;//rest the cnt for next bouquet
                }
            }else{
                 cnt =0;
            }   
        }
        return noOfB>=m;
        
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n =bloomDay.length;
        long val = (long)m*k;//to avoid overflow
        if(val>n) return -1; //not wnough flower to make a bouquet
        int low = Arrays.stream(bloomDay).min().getAsInt();//function to calculate min and max 
        int high =Arrays.stream(bloomDay).max().getAsInt();
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isPossible(bloomDay,mid,m,k)){
                high = mid-1;//look for minimum  days
            } 
            else{
                low = mid +1;//check for more days

            }
           

        }
         return low;//it will provide the answer as it is cross the high 

    }
}