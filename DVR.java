
class DVR {
    static int n = 3;
    static int[][] cost = {
            {0, 1, 5},
            {1, 0, 2},
            {5, 2, 0}
    };

    public static void main(String[] args) {
        int[][] dist = new int[n][n];
        int[][] via = new int[n][n];
        int i, j, k;
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++) {
                dist[i][j] = cost[i][j];
                if (i != j) via[i][j] = j;
                else via[i][j] = i;
            }

        boolean change;
        do {
            change = false;
            for (i = 0; i < n; i++)
                for (j = 0; j < n; j++)
                    for (k = 0; k < n; k++)
                        if (dist[i][j] > dist[i][k] + dist[k][j]) {
                            dist[i][j] = dist[i][k] + dist[k][j];
                            via[i][j] = via[i][k];
                            change = true;
                        }
        } while (change);

        String[] name = {"X", "Y", "Z"};
        for (i = 0; i < n; i++) {
            System.out.println("\nRouting table for " + name[i]);
            System.out.println("Dest  Cost  NextHop");
            for (j = 0; j < n; j++)
                System.out.println(name[j] + "      " + dist[i][j] + "       " + name[via[i][j]]);
        }
    }
}
