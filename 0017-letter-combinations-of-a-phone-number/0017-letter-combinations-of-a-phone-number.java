class Solution {

    private final String[] map;

    //constructor to map the digit ko characters
    public Solution(){
        map = new String[] {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    }

    private void backtrack(String digits, List<String> ans,int index,String current){
        //base case
        if(index == digits.length()){
            ans.add(current);
            return;
        }

        String s = map[digits.charAt(index)-'0'];

        //loop iterate through each character of each digit
        for(int i=0;i<s.length();i++){
            //recursion
            backtrack(digits,ans,index + 1,current + s.charAt(i));

        }
        
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        //agar digit string he empty hoyi toh return krdo ans
        if(digits.length() == 0){
            return ans;
        }

        backtrack(digits,ans,0,"");
        return ans;

        
        
    }
}