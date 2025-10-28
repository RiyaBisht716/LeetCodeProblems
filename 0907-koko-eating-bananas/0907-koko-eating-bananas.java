class Solution { 
    private long CalculateTotalHours(int []piles ,int h){
        long totalH =0L; // L means long
        for(int bananas: piles){
           totalH += ((long) bananas + h - 1L) / h; // ceil (a/b) =(a+b-1)/b
        }
        return totalH;

    }
    public int minEatingSpeed(int[] piles, int h) {

         // Find maximum element
         //stream is a sequence of data that convert
         //array into Intgers
         //max function find max element
         //getAsInt present the max value as int
        int maxPile = Arrays.stream(piles).max().getAsInt(); 

        int low = 1;
        int high = maxPile;
        int ans = maxPile;
        

        while(low <= high){
            int mid = low + (high-low)/2;
            long  totalH = CalculateTotalHours(piles,mid);
            
            // If possible, try smaller speed
            if(totalH <= (long)h){
                ans = mid;
                high = mid-1;
            
            }
             
            // Otherwise, try larger speed
            else{
                low = mid +1;
            }
        }
        return ans;

        
    }
}