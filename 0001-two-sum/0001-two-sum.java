class Solution {
    public int[] twoSum(int[] nums, int target) {
       // hash map approach
       int n = nums.length;
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<n;i++){
        int var  = target - nums[i];

        if(map.containsKey(var)){
            return new int[]{map.get(var),i};
        }
        map.put(nums[i],i);
       }
       return new int[]{-1,-1};
    }
}