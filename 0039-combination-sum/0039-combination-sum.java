class Solution {

    public void backtrack(int index, int target,int []arr,List<List<Integer>> ans ,List<Integer> ds){
        //base case 
        if(index == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            

            }
            return;
        }

            if(arr[index] <=target){
                ds.add(arr[index]);
                backtrack(index,target-arr[index],arr,ans,ds);
                ds.remove(ds.size()-1);
            }
            //not add current element and move to the index pointer  
            backtrack(index + 1,target, arr,ans,ds);
            
        

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        backtrack(0,target,candidates,ans,ds);
        return ans;
        
    }
}