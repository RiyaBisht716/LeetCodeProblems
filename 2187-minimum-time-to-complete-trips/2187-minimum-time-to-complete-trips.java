class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long start =1;
        long end = (long)getMin(time) * totalTrips;

        while(start < end ){
            long mid = start + ( end - start )/2;
            if(canComplete(time,totalTrips,mid)){
                end = mid;

            }
            else {
                start = mid + 1;
                       
            }
        }
        return start;
    
    }
    public boolean canComplete(int[]time, int totalTrips,long givenTime){
        int trip= 0;
        for(int t:time){
            trip+= givenTime/t;
            if(trip >=totalTrips){
                return true;
                 
            }
        }
        return false;
    }
    private int getMin(int[]time){
        int min = time[0];
        for(int t:time){
            min = Math.min(min,t);
        }
        return min;

    }
}