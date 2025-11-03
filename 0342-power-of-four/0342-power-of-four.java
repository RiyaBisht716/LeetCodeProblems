class Solution {
    public boolean isPowerOfFour(int n) {
        //base cases
        if(n<=0) return false;

        if(n ==1) return true;//basec case: 4^0 =1

        //check both divisibility and power of four by recursion calls

        return(n%4 ==0 && isPowerOfFour(n/4));

        
    }
}