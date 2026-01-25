class Solution {

    private void findCombination(int index,int target, int[] nums, List<List<Integer>>ans, List<Integer> ds){
        //base case
      
              if(target == 0){
                ans.add(new ArrayList<>(ds));
                return;
                
             
            }
          
            
        
            //handle duplicate
            for(int i=index;i<nums.length;i++){
                if(i >index && nums[i] == nums[i-1]) continue;

                if(nums[i]> target) break;

                ds.add(nums[i]);
                //for next recursion
                findCombination(i+1,target-nums[i],nums,ans,ds);
                ds.remove(ds.size()-1);

            }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);//sorting for handling the duplicate
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        findCombination(0,target,candidates,ans,ds);
        return ans;

        
    }
}