class Solution {
    public boolean isPowerOfThree(int n) {
        //base cases
        if(n<=0) {
            return false;//handle both zero & negative values
        }
        
        if(n==1) {
            return true;//3^0=1
        }
        //not divisible by 3 ,not a power of 3
        if(n%3 !=0){
            return false;
        }
        //recursive calls: divide by 3 and check again
        return isPowerOfThree(n/3);
        
        
    }
}