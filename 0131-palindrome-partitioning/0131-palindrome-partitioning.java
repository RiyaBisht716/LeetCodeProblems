class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        backtrack(0,s,path,ans);
        return ans;
    }

    private void backtrack(int index ,String s, List<String> path, List<List<String>> ans){
        //base condition to stop the recursion
        if(index == s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        //try all the possible substring from starting index to last
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                path.add(s.substring(index,i+1));
                //backtrack for next recursion
                backtrack(i+1,s,path,ans);
                path.remove(path.size()-1);
 
          }
        }
     }
    private boolean isPalindrome(String s, int start,int end){
        while(start<=end){
            if(s.charAt(start++)!= s.charAt(end--)) return false;
        }
        return true;
    }
}