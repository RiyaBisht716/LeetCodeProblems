class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int maxCandies = 0;
        
        for(int c: candies){
            maxCandies = Math.max(c, maxCandies);
        }
        for(int candy: candies){
            ans.add(candy + extraCandies >= maxCandies) ;
        }
        return ans;
    }
}