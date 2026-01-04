class Solution {
    public int myAtoi(String s) {
        // //initializaation 
        // int i = 0 , sign =1;
        // long ans = 0; //long isliye taki integer overflow na ho

        // while(i< s.length() && s.charAt(i) == ' ') i++; //to ignore the whitespace

        // if( i== s.length()) return 0; // only found a whitespace in a string

        // if(s.charAt(i) == '-'){ //check for negative sign
        //     sign =-1;
        //     i++;
        // }
        // else if(s.charAt(i) == '+'){ //check for positive sign
        //     i++;
        // }

        // //convert char to integer
        // while(i<s.length() && Character.isDigit(s.charAt(i))){
        //     ans = ans * 10 + (s.charAt(i) - '0');
        //      // Clamp to Integer.MAX_VALUE if overflow
        //     if (sign * ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        //     // Clamp to Integer.MIN_VALUE if underflow
        //     if (sign * ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        //     i++;
        // }

        // return(int) (sign * ans);

        s = s.trim(); //it will trim down the spaces
        //check the string is empty or not
        if(s.length()==0) return 0;
        
        int sign =1;
        long ans = 0; //to control the integer overflow
        if(s.charAt(0) == '-') sign =-1;

        int max =Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        //INITIALIZE THE i

        int i = (s.charAt(0) =='+' || s.charAt(0)=='-') ? 1:0; // pointer index 0 ya 1 se start hoga

        while(i<s.length()){
            if(s.charAt(i)== ' ' || !Character.isDigit(s.charAt(i)) )break; //check the non-digit no
            ans = ans * 10 + s.charAt(i) -'0';
            //check the condition

            if(sign ==-1 && -1 * ans<min) return min;
            if(sign == 1 &&  1* ans > max) return max;
            i++;


        }
        return (int) (sign *ans);



    }
}