class Solution {
    public double myPow(double x, int n) {
        // long N =n; //to avoid overflow
        // while(N< 0){//negative value ke liye 
        //     x = 1/x;//take inverse
        //     N= -N;
        // }
        // double ans =1;
        // while(N > 0){ //for positive value
        //    if(N %2 ==1) ans *= x; //check for nN=1
        //    x*=x;
        //    N/=2; 


        // }
        // return ans;
        double ans = 1.0;
        long num =n;
        //handle when  n is negative
        if(num<0) num = -1 *  num;

        while(num>0){
            if(num %2==1){
                ans = ans * x;
                num= num-1;
            }
            else{
                x = x * x;
                num = num/2;
            }
        }  
        if(n<0) ans = (double) (1.0)/(double)(ans);
        return ans;     
    }
}