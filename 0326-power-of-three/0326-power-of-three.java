class Solution {
    public boolean isPowerOfThree(int n) {
        //if n is 0
        if(n<1) {
            return false;
        }
        //if n is equal to 1
        else if(n==1) {
            return true;
        }
        else{
            while(n % 3 ==0){
                n/=3;
            }
            if(n==1) {
                return true;
            }
            else {
                return false;
            }
        }
        
        
    }
}