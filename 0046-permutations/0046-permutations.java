class Solution {
    // private void recurrPermute(int[]nums ,List<List<Integer>> result, List<Integer> ds, boolean []freq ){
    //     //base case
    //     if(ds.size()== nums.length){
    //         result.add(new ArrayList<>(ds));
    //         return;

    //     }
    //     //Start loop from o to n-1
    //     for(int i=0;i<nums.length;i++){
    //         if(!freq[i]){
    //             freq[i] = true; //map the current element in freq map
    //             ds.add(nums[i]);//add in a ds
    //             recurrPermute(nums,result,ds,freq);
    //             ds.remove(ds.size()-1);//remove last add element in ds
    //             freq[i] =false;//unpick the element

    //         }
    //     }

    // }

    //  //Approach 1: using extra space of hash array to map the frequency
    // public List<List<Integer>> permute(int[] nums) {
        
    //     List<List<Integer>> result = new ArrayList<>();
    //     List<Integer> ds = new ArrayList<>();
    //     boolean [] freq = new boolean [nums.length];
    //     recurrPermute(nums,result,ds,freq);
    //     return result;
    // }
     //Approach 2 : using swapping
    private void recurrPermute(int index ,int []nums,List<List<Integer>> ans ){
        //base case
        if(index == nums.length){
            //copy element from ds to ans
            List<Integer> ds = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<nums.length;i++){
            //swap the element from index to n-1
            swap(i,index,nums);
            recurrPermute(index+1,nums,ans);
            swap(i,index,nums);
        }
    }
    private void swap(int i,int j,int[]nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        recurrPermute(0,nums,ans);
        return ans;

    }
}