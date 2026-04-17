class Solution {
    //Time Complexity :- O(n)
    //Space Complexity:- O(k)
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<nums.length;i++){

            //maintain the window out of size
            if(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst(); //remove the oldest index in deque
            }

            //Maintain the decreasing deque

            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }
            //add the current elment in deque

            dq.offerLast(i);
            //printing the result

            if(i >= k-1){
                ans.add(nums[dq.peekFirst()]);
            }
        }
        //convert list into array
            int [] res = new int[ans.size()];
            for(int i=0;i< ans.size();i++){
                res[i] = ans.get(i);
            }
        return res;
    }
}