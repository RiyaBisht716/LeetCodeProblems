class Solution {

    public static void swapIfGreater(int [] nums1,int[] nums2,int index1,int index2){
        if(nums1[index1]> nums2[index2]){
            int temp = nums1[index1];
            nums1[index1] = nums2[index2];
            nums2[index2] = temp;
        }
    } 
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // len of the imaginary single array:
        int len = m + n;
         // Initial gap:
        int gap = (len/2) + (len%2);
        while(gap > 0){
            int left =0;
            int right = left + gap;
            while(right <len){
                 // case 1: left in arr1[]
                //and right in arr2[]:
                if(left <m && right >=m){
                    swapIfGreater(nums1,nums2,left,right-m);
                }// case 2: both pointers in arr2[]:
                else if(left>=m){
                    swapIfGreater(nums2,nums2,left-m,right-m);

                }
                 // case 3: both pointers in arr1[]:
                else{
                    swapIfGreater(nums1,nums1,left,right);
                }
                left++;
                right++;

            }
            // break if iteration gap=1 is completed:
            if(gap==1) break;
            // Otherwise, calculate new gap:
            gap = (gap/2) + (gap%2);
        }
        for (int i = 0; i < n; i++) { 
            nums1[m + i] = nums2[i];
            }

    }
}