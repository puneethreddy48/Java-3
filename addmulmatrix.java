public class addmulmatrix {
    public static void main(String[] args) {

        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        
        int[][] sum = new int[2][2];
        int[][] product = new int[2][2];

        // ----- Matrix Addition -----
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        // ----- Matrix Multiplication -----
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                product[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // ----- Display Addition Result -----
        System.out.println("Matrix Addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        // ----- Display Multiplication Result -----
        System.out.println("Matrix Multiplication:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
