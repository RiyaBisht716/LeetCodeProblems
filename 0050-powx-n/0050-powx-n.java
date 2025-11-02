class Solution {
    public double myPow(double x, int n) {
        long N =n; //to avoid overflow
        while(N< 0){//negative value ke liye 
            x = 1/x;//take inverse
            N= -N;
        }
        double ans =1;
        while(N > 0){ //for positive value
           if(N %2 ==1) ans *= x; //check for nN=1
           x*=x;
           N/=2; 


        }
        return ans;
        
    }
}