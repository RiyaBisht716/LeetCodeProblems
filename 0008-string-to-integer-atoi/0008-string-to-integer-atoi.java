class Solution {
    public int myAtoi(String s) {
        // s = s.trim(); //it will trim down the spaces
        // //check the string is empty or not
        // if(s.length()==0) return 0;
        
        // int sign =1;
        // long ans = 0; //to control the integer overflow
        // if(s.charAt(0) == '-') sign =-1;

        // int max =Integer.MAX_VALUE;//answer out of bound na jaye isliye
        // int min = Integer.MIN_VALUE;
        // //INITIALIZE THE i

        // int i = (s.charAt(0) =='+' || s.charAt(0)=='-') ? 1:0; // pointer index 0 ya 1 se start hoga

        // while(i<s.length()){
        //     if(s.charAt(i)== ' ' || !Character.isDigit(s.charAt(i)) )break; //check the non-digit no
        //     ans = ans * 10 + s.charAt(i) -'0';
        //     //check the condition

        //     if(sign ==-1 && -1 * ans<min) return min;
        //     if(sign == 1 &&  1* ans > max) return max;
        //     i++;


        // } 
        // return (int) (sign *ans);

        //USING RECURSION
        //handle null point exception
        if(s == null) return 0;
        s =s.trim();
        //handle empty string 
        if(s.length()==0) return 0;
        int sign =1;
        int i=0;
        if(s.charAt(0) == '-' ) sign =-1;
        i= (s.charAt(0)=='+' || s.charAt(0)== '-') ? 1:0;

         return (int) myAtoiRecursive(s,i,sign,0);

    }
    private long myAtoiRecursive(String s, int i,int sign,long ans){

        //Stopping condition

        if(i>=s.length() || !Character.isDigit(s.charAt(i))){
            return (sign * ans);
        }

        ans = ans * 10 + (s.charAt(i)-'0');

        //overflow condition
        int max =Integer.MAX_VALUE;
        int min =Integer.MIN_VALUE;

        if(sign == -1 && -1 * ans < min) return min;
        if(sign == 1 && 1* ans > max) return max;

        return myAtoiRecursive(s,i+1,sign,ans);
    }
   
}