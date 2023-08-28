public class MatrixRankCalculator 
{
    public static int calculateRank(int[][] matrix) 
    {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int rank = Math.min(rowCount, colCount);
        for (int row = 0; row < rank; row++) 
        {
            if (matrix[row][row] != 0) 
            {
                for (int col = 0; col < rowCount; col++) 
                {
                    if (col != row) 
                    {
                        int multiplier = matrix[col][row] / matrix[row][row];
                        for (int i = 0; i < rank; i++) 
                        {
                            matrix[col][i] -= multiplier * matrix[row][i];
                        }
                    }
                }
            }
            else 
            {
                boolean reduce = true;
                for (int i = row + 1; i < rowCount; i++) 
                {
                    if (matrix[i][row] != 0) 
                    {
                        int[] temp = matrix[row];
                        matrix[row] = matrix[i];
                        matrix[i] = temp;
                        reduce = false;
                        break;
                    }
                }
                if (reduce) 
                {
                    rank--;
                    for (int i = 0; i < rowCount; i++) 
                    {
                        matrix[i][row] = matrix[i][rank];
                    }
                }
                row--;
            }
        } 
        return rank;
    }
    public static void main(String[] args) 
    {
        int[][] matrix = 
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int rank = calculateRank(matrix);
        System.out.println("Rank of the matrix: " + rank);
    }
}