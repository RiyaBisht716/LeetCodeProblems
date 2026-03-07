class Solution {
    public boolean isValid(String s) {

        //Time Complexity:- O(n) and Space Complexity:- O(n) 
        Stack<Character> st = new Stack<>();

        for(char c: s.toCharArray()){
            //push opening bracket arhe 
            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            }

            else{
                if(st.isEmpty()) return false;
                char top = st.pop();
                 if((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')){
                    continue;
                 }
                    else return false;
                }
        }
        return st.isEmpty(); //agar true hoga tabhi he
    }
}