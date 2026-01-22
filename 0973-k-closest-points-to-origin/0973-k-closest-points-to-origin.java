class Solution {

    void calculateDistance(int[][] points,
                           TreeMap<Integer, List<int[]>> disPath) {

        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];

            int dist = x * x + y * y; // NO sqrt

            disPath.putIfAbsent(dist, new ArrayList<>());
            disPath.get(dist).add(new int[]{x, y});
        }
  }
  
    public int[][] kClosest(int[][] points, int k) {
         List<int[]> ans = new ArrayList<>();
        TreeMap<Integer, List<int[]>> disPath = new TreeMap<>();

        calculateDistance(points, disPath);

        for (Map.Entry<Integer, List<int[]>> entry : disPath.entrySet()) {
            for (int[] p : entry.getValue()) {
                if (k == 0) {
                    return ans.toArray(new int[ans.size()][2]);
                }
                ans.add(new int[]{p[0], p[1]});
                k--;
            }
        }

        return ans.toArray(new int[ans.size()][2]);
    }
}