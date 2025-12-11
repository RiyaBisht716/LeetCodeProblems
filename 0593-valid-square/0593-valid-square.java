class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[] dist = new int[]{
            distSq(p1, p2),
            distSq(p1, p3),
            distSq(p1, p4),
            distSq(p2, p3),
            distSq(p2, p4),
            distSq(p3, p4)
        };

        Arrays.sort(dist);

        // First 4 distances must be equal (sides)
        // They also must be non-zero (no overlapping points)
        if (dist[0] == 0) return false;
        if (!(dist[0] == dist[1] && dist[1] == dist[2] && dist[2] == dist[3])) {
            return false;
        }

        // Last two distances (diagonals) must be equal
        return dist[4] == dist[5];
    }

    private int distSq(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];
        return dx * dx + dy * dy;
    }
}