public class JalurEnergiMaksimum {
    public static void main(String[] args) {
        int[][] grid = {
            {5, 3, 2, 1},
            {1, 2, 10, 2},
            {4, 3, 1, 3},
            {2, 1, 2, 20}
        };

        int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int[n][m];      // Menyimpan total energi maksimum
        String[][] path = new String[n][m];  // Menyimpan jalur terbaik

        dp[0][0] = grid[0][0];
        path[0][0] = "(0,0)";

        // Mengisi baris pertama
        for (int j = 1; j < m; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
            path[0][j] = path[0][j - 1] + " -> (" + 0 + "," + j + ")";
        }

        // Mengisi kolom pertama
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
            path[i][0] = path[i - 1][0] + " -> (" + i + "," + 0 + ")";
        }

        // Mengisi sisa elemen matriks dp
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (dp[i - 1][j] > dp[i][j - 1]) {
                    dp[i][j] = grid[i][j] + dp[i - 1][j];
                    path[i][j] = path[i - 1][j] + " -> (" + i + "," + j + ")";
                } else {
                    dp[i][j] = grid[i][j] + dp[i][j - 1];
                    path[i][j] = path[i][j - 1] + " -> (" + i + "," + j + ")";
                }
            }
        }


        System.out.println("Jalur terbaik: " + path[n - 1][m - 1]);
        System.out.println("Total Energi Maksimum: " + dp[n - 1][m - 1]);
    }
}
