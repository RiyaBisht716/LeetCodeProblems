class Solution {

    public boolean isSetBit(int n){
        while(n>0){
            if((n&1)==0){
                 return false;
             
            }
            n =n>>1;
        
        }
        return true;
    }
    public int smallestNumber(int n) {
        int x = n;
        while(!isSetBit(x)){
            x++;
        }
        
        return x;

    }
}