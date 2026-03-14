class Solution {
    List<String> res = new ArrayList<>();
    public String getHappyString(int n, int k) {
        backtrack("", n);

        if (k > res.size()) return "";
        return res.get(k - 1);
    
    }
    private void backtrack(String curr, int n) {

        if (curr.length() == n) {
            res.add(curr);
            return;
        }

        char[] chars = {'a', 'b', 'c'};

        for (char ch : chars) {

            if (curr.length() == 0 || curr.charAt(curr.length() - 1) != ch) {
                backtrack(curr + ch, n);
            }

        }
}
}