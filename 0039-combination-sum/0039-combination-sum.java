class Solution {

    public void findCombinations(int idx ,int target,int[]arr,List<List<Integer>> ans ,List<Integer> ds){
        //Base conditions
        if(idx == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;

        }

        //to pick the element for combination
        if(arr[idx]<= target){
            ds.add(arr[idx]);
            findCombinations(idx, target-arr[idx] ,arr,ans,ds);
            ds.remove(ds.size()-1); //backtrack occur impotant to remove the last element
        }
        findCombinations(idx+1, target , arr, ans ,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();//to stor the final answer
        List<Integer> ds = new ArrayList<>(); //to store the ds 
        findCombinations(0,target,candidates,ans,ds);
        return ans; 
    }
}