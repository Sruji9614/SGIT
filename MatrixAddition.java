public class MatrixAddition 
{
   public static void main(String[] args) 
    {
        int rows = 3;
        int columns = 3;
        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] matrix2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
        int[][] sum = new int[rows][columns];

        // Adding matrices
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        // Displaying the result
        System.out.println("Matrix after addition:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}