class Solution {
    public String largestOddNumber(String num) {
        for(int i = num.length()-1;i>=0;i--){ //find largest odd number in a string
            if((num.charAt(i) - '0') % 2 == 1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}