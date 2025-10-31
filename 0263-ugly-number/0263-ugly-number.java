class Solution {
    //prime factor woh factor hai joh prime no bhi hote hai
    public boolean isUgly(int n) { 
        if(n<=0) return false;
        for(int p : new int[]{2,3,5}){
            while(n%p==0){//jb tk divide krte jao ab jb tk 1 ke equal 
                n/=p;
            }
        }
        return n==1;
    }
}