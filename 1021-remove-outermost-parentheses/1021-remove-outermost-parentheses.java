class Solution {
    public String removeOuterParentheses(String s) {
        int cnt =0;//track the bracket
        StringBuilder sb = new StringBuilder();//cratev a new object
        boolean add = false;
        for(char c : s.toCharArray()){
            if(c == '('){
                cnt++;

            }
            else if(c ==')'){
                cnt--;
            }
            if(c == '(' && cnt ==2){
                add =true;
            }
            else if(c ==')' && cnt ==0){
                add =false;
            }
            if(add){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}