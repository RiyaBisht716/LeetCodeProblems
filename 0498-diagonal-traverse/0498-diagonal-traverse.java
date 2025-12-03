class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        // TreeMap keeps keys sorted like C++ map
        Map<Integer, List<Integer>> mp = new TreeMap<>();

        // Group elements by (i + j)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int key = i + j;
                mp.putIfAbsent(key, new ArrayList<>());
                mp.get(key).add(mat[i][j]);
            }
        }

        boolean flip = true;
        List<Integer> ans = new ArrayList<>();

        // Traverse diagonals in sorted order
        for (Map.Entry<Integer, List<Integer>> entry : mp.entrySet()) {
            List<Integer> list = entry.getValue();
            if (flip) {
                Collections.reverse(list);
            }
            ans.addAll(list);
            flip = !flip;
        }

        // Convert List<Integer> → int[]
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}