class Solution {
    public static int CountPartitions(int []nums,int maxSum){
        int n =nums.length;
        int partitions =1;
        int subArraySum = 0;
        for(int i=0;i<n;i++){
            if(subArraySum + nums[i] <= maxSum){//same as book allocation problem
                subArraySum+= nums[i];


            }else{
                partitions++;
                subArraySum = nums[i];
            }
        }
        return partitions;
    }
    public int splitArray(int[] nums, int k) {
        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();

        while(low<=high){
            int mid = low +(high-low)/2;
            int partitions = CountPartitions(nums,mid);
            if(partitions >k){
                low =mid+1;
            }else{
                high = mid-1;
            }
        }
        return low;
        
    }
}