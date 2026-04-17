class Solution {
    public int largestRectangleArea(int[] heights) {
        //Time Complexity :- O(n) + O(n) for traversal and other operations
        //Space Complexity:- O(n) for stack

        // stack used to store the index of heights to maintain the increasing order
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        int num = heights.length;
        for(int i=0;i<=num;i++){
            //handle the remaining  stack element
            //create a dummy node in end for height 0

            
             int currHeight = (i == num)? 0: heights[i];
             // agar koew choti value encounter hoyi to pop kro or calculate the area
             while(!st.isEmpty() && heights[st.peek()] >= currHeight){

                int height = heights[st.pop()];
                int width = st.isEmpty()? i : i- st.peek() - 1;

                maxArea = Math.max( maxArea, height * width);

             }

             st.push(i);

             }  
             return maxArea;

        }  
}