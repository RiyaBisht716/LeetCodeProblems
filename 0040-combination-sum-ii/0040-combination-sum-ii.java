class Solution {
    public void findCombination(int idx , int target, int[] arr, List<List<Integer>> result , List<Integer> current){
        //base condition
        if(target == 0){
            result.add(new ArrayList<>(current));
            return ;
        }
        //starting a loop from index to n-1 
        for(int i =idx;i<arr.length;i++){
            //handle duplicate
            if(i>idx && arr[i] == arr[i-1]) continue;
            //the loop will break when current element is greater than target
            if(arr[i] > target) break;
            current.add(arr[i]);
            findCombination(i+1,target-arr[i], arr,result,current);
            current.remove(current.size()-1);//last elemt from current will be removed
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);//sort the array as it is important in duplicates values
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        findCombination(0,target,candidates,result,current);
        return result;
      
    }
}