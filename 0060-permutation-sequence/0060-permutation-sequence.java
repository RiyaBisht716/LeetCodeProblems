class Solution {
    public String getPermutation(int n, int k) {
        int fact =1;
        List<Integer> numbers = new ArrayList<>();
        for(int i=1;i<n;i++){
            fact*=i;
            numbers.add(i);
        }        
        numbers.add(n);//to add the last element
        StringBuilder ans = new StringBuilder();
        k=k-1;//convert k to 0th based indexing
        while(true){
            ans.append(numbers.get(k/fact));
            numbers.remove(k/fact);
            if(numbers.isEmpty()){
                break;
            }
            k= k % fact;//upadte the k value from the remaining one
            fact = fact /numbers.size();

        }
        return ans.toString();


    }
}