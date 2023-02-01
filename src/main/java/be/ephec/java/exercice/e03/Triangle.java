package be.ephec.java.exercice.e03;


public class Triangle {
    public int nombre;

    public int[][] triangle(int n) {

            int [][] tab2D = new int[n+1][n+1];
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= i; j++) {
                    if (j == 0) {
                        tab2D[i][0] = 1;
                    } else if (i == j) {
                        tab2D[i][j] = 1;
                    } else {
                        tab2D[i][j] = tab2D[i - 1][j] + tab2D[i - 1][j - 1];
                    }
                }
            }
        return tab2D;
    }
}

