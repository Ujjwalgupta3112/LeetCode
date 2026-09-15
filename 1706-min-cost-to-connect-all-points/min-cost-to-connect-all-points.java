class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        boolean[] visited = new boolean[n];
        int[] minCost = new int[n];
        for (int i = 0; i < n; i++) {
            minCost[i] = Integer.MAX_VALUE;
        }
        minCost[0] = 0;
        int totalCost = 0;
        for (int count = 0; count < n; count++) {
            int current = -1;
            for (int i = 0; i < n; i++) {
                if (!visited[i] &&
                    (current == -1 || minCost[i] < minCost[current])) {
                    current = i;
                }
            }
            visited[current] = true;
            totalCost += minCost[current];
            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    int distance =
                        Math.abs(points[current][0] - points[i][0])
                        + Math.abs(points[current][1] - points[i][1]);
                    minCost[i] = Math.min(minCost[i], distance);
                }
            }
        }
        return totalCost;
    }
}