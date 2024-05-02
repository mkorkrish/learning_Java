public class Main {
    public static void main(String[] args) {
        int[][] a = { {1, 2}, {3, 4} };
        int[][] b = { {2, 0}, {1, 3} };
        int[][] c = new int[a.length][b[0].length]; // Initialize result matrix

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    c[i][j] += a[i][k] * b[k][j]; // Multiply and accumulate
                }
            }
        }

        // Printing the result matrix
        for (int[] row : c) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
