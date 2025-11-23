class Solution {
    public int reverseBits(int n) {
        int ans =0;
        for(int i=0 ;i<32 ;i++){
            ans<<=1;//shift left sode ans
            ans |=(n&1);//take last bit and add
            n>>>=1;//right shift
        }
        return ans;
    }
}