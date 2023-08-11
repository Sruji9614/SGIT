public class MatrixNorm {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;

        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        double norm = 0.0;

        // Computing the Frobenius norm of the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                norm += Math.pow(matrix[i][j], 2);
            }
        }
        norm = Math.sqrt(norm);

        // Displaying the result
        System.out.println("Frobenius norm of the matrix: " + norm);
    }
}
