class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack();
        char[] ch= s.toCharArray();
        StringBuilder ans = new StringBuilder();
        for(char c:ch){
            if(st.isEmpty()){
                st.push(c);
            }

            else if(c == '('){
                st.push(c);
                ans.append(c);
            }

            else {
                if(st.size() >= 2){
                    st.pop();
                    ans.append(c);

                }
                else{
                    st.pop();
                }
    
            }
            
        }
        return ans.toString();
        
    }
}