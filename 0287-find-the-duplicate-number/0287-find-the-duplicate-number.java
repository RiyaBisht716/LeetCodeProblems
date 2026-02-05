class Solution {
    // public int findDuplicate(int[] nums) {
    //     HashSet<Integer> set = new HashSet<>();
    //     for(int num : nums){
    //         if(!set.add(num)){
    //             return num;
    //         }
    //     }
    //     return -1;
        
    // }
    public static int findDuplicate(int[]nums){
        for(int num : nums){
            int index = Math.abs(num);//hum joh no mil rha hai usko negative mark kr rhe hai

            if(nums[index] < 0){
                return index;//duplicate found
            }
            nums[index] = -nums[index];
        }
        return -1;

    }
 
}