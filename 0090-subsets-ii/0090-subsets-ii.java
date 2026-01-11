class Solution {
    public void backtrack(int index,int[]nums,List<Integer> current, List<List<Integer>> ans){
        //add the current subset list in ans 
        ans.add(new ArrayList<>(current));
        for(int i=index ;i<nums.length;i++){
            //handle duplicates values
            if(i> index && nums[i] == nums[i-1]) continue;
            current.add(nums[i]);
            //increase the i value by i for next subset
            backtrack(i+1,nums,current,ans);
            //yaad rakho last mai current se last value remove krna important hai!!
            current.remove(current.size()-1);
    
        
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        //Sort the array to handle duplicate value
        Arrays.sort(nums);
        //List to store the final result
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0,nums,new ArrayList<>(),ans);
        return ans;

        
    }
}




            