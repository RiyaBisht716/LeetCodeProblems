class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        // Edge case
        if (bound < 2) return result;

        for (int a = 1; a < bound; a *= x) {
            for (int b = 1; a + b <= bound; b *= y) {
                set.add(a + b);
                if (y == 1) break; // avoid infinite loop
            }
            if (x == 1) break; // avoid infinite loop
        }

        result.addAll(set);
        return result;
    }
}