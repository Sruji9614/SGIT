public class SymmetricMatrixChecker 
{
    public static boolean isSymmetric(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows != cols) {
            return false;  // A non-square matrix cannot be symmetric
        }
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                if (matrix[i][j] != matrix[j][i]) 
                {
                    return false;  // Non-symmetric elements found
                }
            }
        }
        return true;  // All elements match their corresponding transposed elements
    }
    public static void main(String[] args) 
    {
        int[][] symmetricMatrix = 
        {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        int[][] nonSymmetricMatrix = 
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        boolean isSymmetric1 = isSymmetric(symmetricMatrix);
        boolean isSymmetric2 = isSymmetric(nonSymmetricMatrix);
        System.out.println("Is the first matrix symmetric? " + isSymmetric1);
        System.out.println("Is the second matrix symmetric? " + isSymmetric2);
    }
}
 