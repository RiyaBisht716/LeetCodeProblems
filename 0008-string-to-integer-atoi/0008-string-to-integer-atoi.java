class Solution {
    public int myAtoi(String s) {
        //initializaation 
        int i = 0 , sign =1;
        long ans = 0; //long isliye taki integer overflow na ho

        while(i< s.length() && s.charAt(i) == ' ') i++; //to ignore the whitespace

        if( i== s.length()) return 0; // only found a whitespace in a string

        if(s.charAt(i) == '-'){ //check for negative sign
            sign =-1;
            i++;
        }
        else if(s.charAt(i) == '+'){ //check for positive sign
            i++;
        }

        //convert char to integer
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            ans = ans * 10 + (s.charAt(i) - '0');
             // Clamp to Integer.MAX_VALUE if overflow
            if (sign * ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;

            // Clamp to Integer.MIN_VALUE if underflow
            if (sign * ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }

        return(int) (sign * ans);


    }
}