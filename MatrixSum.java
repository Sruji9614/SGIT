public class MatrixSum 
{
    public static void main(String[] args) 
    {
        int rows = 3;
        int columns = 3;
        int[][] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };
        int[] rowSums = new int[rows];
        int[] columnSums = new int[columns];
        // Compute row sums
        for (int i = 0; i < rows; i++) 
        {
            int rowSum = 0;
            for (int j = 0; j < columns; j++) 
            {
                rowSum += matrix[i][j];
            }
            rowSums[i] = rowSum;
        }
        // Compute column sums
        for (int j = 0; j < columns; j++) 
        {
            int columnSum = 0;
            for (int i = 0; i < rows; i++) 
            {
                columnSum += matrix[i][j];
            }
            columnSums[j] = columnSum;
        }
        // Display row sums
        System.out.println("Row sums:");
        for (int i = 0; i < rows; i++) 
        {
            System.out.println("Row " + i + ": " + rowSums[i]);
        }
        // Display column sums
        System.out.println("Column sums:");
        for (int j = 0; j < columns; j++) 
        {
            System.out.println("Column " + j + ": " + columnSums[j]);
        }
    }
}
