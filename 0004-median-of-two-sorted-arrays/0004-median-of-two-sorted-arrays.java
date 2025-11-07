class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //the array1 will be smaller to minimize the binary search
        if(nums1.length > nums2.length) return findMedianSortedArrays(nums2,nums1);

        int n1 =nums1.length;
        int n2 = nums2.length;
        int low = 0;
        int high = n1;

        //apply binary search in smaller array
        while(low<=high){
            int mid1 = (low+high)/2;
            int mid2= (n1+n2+1) /2 -mid1;
            //finding the left and right partition in a array
            int l1 =(mid1==0)? Integer.MIN_VALUE: nums1[mid1-1];
            int l2 = (mid2==0)? Integer.MIN_VALUE: nums2[mid2-1];
            int r1 =(mid1==n1)? Integer.MAX_VALUE: nums1[mid1];
            int r2 =(mid2==n2)? Integer.MAX_VALUE: nums2[mid2];
            int n =n1+n2;

            //partitions are  valid 
            if(l1<=r2 && l2<=r1){
                //total elements are even-> average of median elements
                if(n %2 ==0) {
                return (Math.max(l1,l2)+ Math.min(r1,r2))/2.0;
                }
                else{
                //total elements are odd-> max of l1 and l2
                return Math.max(l1,l2);
                }

            }
            //move left in array
            else if(l1>r2){
                high = mid1 -1;
            
            }
            else{
                low = mid1+1;
            }
        }
        return 0.0;
        
    
 }
}