public class AddTwoSpraceMatrix 
{
    public static void main(String[] args) 
    {
        int numRows = 3;
        int numCols = 4;

        int[] values1 = {1, 2, 0, 4, 0};
        int[] colIndices1 = {1, 2, 0, 2, 3};
        int[] rowPointers1 = {0, 2, 3, 5};

        int[] values2 = {0, 2, 3, 0, 5};
        int[] colIndices2 = {1, 2, 0, 2, 3};
        int[] rowPointers2 = {0, 2, 3, 5};

        SparseMatrix matrix1 = new SparseMatrix(numRows, numCols, values1, colIndices1, rowPointers1);
        SparseMatrix matrix2 = new SparseMatrix(numRows, numCols, values2, colIndices2, rowPointers2);

        SparseMatrix result = matrix1.add(matrix2);

        // Print the result matrix
        for (int row = 0; row < numRows; row++) 
        {
            for (int col = 0; col < numCols; col++) 
            {
                System.out.print(result.get(row, col) + " ");
            }
            System.out.println();
        }
    }
}