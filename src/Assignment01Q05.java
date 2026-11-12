public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0;
        }
        int n = m.length;
        boolean[] visited = new boolean[n];
        int[] distance = new int[n];
        for (int k = 0; k < n; k++) {
            distance[k] = Integer.MAX_VALUE;
        }
        distance[i] = 0;
        for (int count = 0; count < n - 1; count++) {
            int u = -1;
            for (int k = 0; k < n; k++) {
                if (!visited[k] && (u == -1 || distance[k] < distance[u])) {
                    u = k;
                }
            }
            if (distance[u] == Integer.MAX_VALUE) {
                break;
            }
            visited[u] = true;
            for (int v = 0; v < n; v++) {
                if (m[u][v] == 1 && !visited[v]) {
                    int alt = distance[u] + 1;
                    if (alt < distance[v]) {
                        distance[v] = alt;
                    }
                }
            }
        }
        if (distance[j] != Integer.MAX_VALUE) {
            return distance[j];
        }   
       
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}