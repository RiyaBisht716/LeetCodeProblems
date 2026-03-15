class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> gray = new ArrayList<>();
        int size = 1 << n; // 2^n

        // gray = i ^ (i >> 1)
        for (int i = 0; i < size; i++) {
            gray.add(i ^ (i >> 1));
        }

        return gray;
    }
}