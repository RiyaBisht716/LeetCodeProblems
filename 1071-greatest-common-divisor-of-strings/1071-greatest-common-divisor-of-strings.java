class Solution {
    public String gcdOfStrings(String str1, String str2) {
       if(!(str1 + str2).equals(str2 + str1)) return ""; // agar string add krke same pattern nhi hai toh no gcd there

       int gcdLen = gcd(str1.length(), str2.length());// it will count the gcd

       return str1.substring(0,gcdLen);
    }

    private int gcd(int a , int b){
        while(b!= 0){ // the gcd is found
            int temp = b;
            b =  a % b;// remainder
            a = temp;// gcd
        }
        return a;
    }
}