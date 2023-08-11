public class NonDiagonalSum 
{
    public static void main(String[] args) 
    {
        int rows = 3;
        int columns = 3;

        int[][] matrix = {{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }};
        int nonDiagonalSum = 0;
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++)
            {
                if (i != j)
                 { 
                    // Check if the element is not on the diagonal
                    nonDiagonalSum += matrix[i][j];
                }
            }
        }
        System.out.println("Sum of all non-diagonal elements: " + nonDiagonalSum);
    }
}
