class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row=1;row<=numRows;row++){
            List<Integer> ansRow = new ArrayList<>();
            long val = 1;
            for(int col= 1;col<=row;col++){
                  ansRow.add((int)val);
                  val = val *(row- col)/col;
                
              
            }
            
            ans.add(ansRow);
        }
        return ans;

        
    }
}