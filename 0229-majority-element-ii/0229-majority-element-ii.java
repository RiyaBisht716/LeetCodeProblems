class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int cnt1 = 0, cnt2 = 0;
        int el1 = 0, el2 = 0;
         for(int num: nums){
            if(num == el1) cnt1++;

            else if(num == el2) cnt2++;

            else if(cnt1 == 0){
                el1 = num;
                cnt1 = 1;
            }

            else if(cnt2 == 0){
                el2 = num;
                cnt2 = 1;
            }

            else{
                cnt1--;
                cnt2--;
            }
         }

         int c1 = 0, c2 =0;
          for(int num: nums){
            if(num == el1){
                c1++;
            }
            else if(num == el2){
                c2++;
            }
            
          }
          List<Integer> ans = new ArrayList<>();
          if(c1 > n/3) ans.add(el1);
          if(c2 > n/3) ans.add(el2);

          return ans;

    }

}