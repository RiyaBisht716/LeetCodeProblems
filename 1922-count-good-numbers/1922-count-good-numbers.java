class Solution {
    static final long MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
       long evenCount = (n+1)/2; //this will count the even position 
       long oddCount = n/2;//this will count the odd position

       long evenWays = power(5,evenCount);//5 choices for even position{0,2,4,6,8}
       long oddWays = power(4,oddCount);// 4 choices for odd position {2,3,5,7}

       return (int)((evenWays * oddWays) % MOD); //MOD WIL KEEP NUMBER SMALL
    }
    private long power(long base,long exp){
        long result =1;
        base %= MOD; //TO REDUCE INTEGER OBVERFLOW

        while(exp >0){
            if((exp &1) ==1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>=1;//right shift 1 mean exp =exp/2
        }
        return result;
    }
}