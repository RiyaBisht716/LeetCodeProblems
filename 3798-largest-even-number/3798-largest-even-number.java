class Solution {
    public String largestEven(String s) {
        int lastTwo = -1;

        //Find the last occurence of string are 2
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='2'){
                lastTwo =i;

            }
        }

        //if last index value is not two
        if(lastTwo == -1){
            return "";
        }

        return s.substring(0,lastTwo+1); //substring(start,end) where end is not included

    }
}