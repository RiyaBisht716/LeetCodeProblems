class Solution {
    public int beautySum(String s) {
        int num = s.length();
        int sum=0;
        // go through all possible substring

        for(int i=0;i<num;i++){
            Map<Character,Integer> freq = new HashMap<>(); //count the frequency of a charcters
            for(int j=i;j<num;j++){
                // to increase the frequency 
                freq.put(s.charAt(j),freq.getOrDefault(s.charAt(j),0)+1);

                int mini = Integer.MAX_VALUE;
                int maxi = Integer.MIN_VALUE;
                //find the maximum and minimum value

                for(int val: freq.values()){
                    mini = Math.min(mini,val);
                    maxi = Math.max(maxi,val);

                }
                sum+= maxi-mini;
                
            }

        }
        return sum;
    }
}