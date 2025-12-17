class Solution {
    public boolean rotateString(String s, String goal) {
        //check whether two strings are unequal or not
        if(s.length() != goal.length()) return false;
        //concatenate the string s with itself

        String doubleS = s  + s;
        //check goal is a substring of concatenated string or not
        return doubleS.contains(goal);

    }
}