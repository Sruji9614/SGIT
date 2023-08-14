public class Transpose 
{
    public static void main(String[] args) 
    {
        int numRows = 3;
        int numCols = 4;

        SparseMatrix sparseMatrix = new SparseMatrix(numRows, numCols);
        sparseMatrix.insert(0, 1, 2);
        sparseMatrix.insert(1, 2, 3);
        sparseMatrix.insert(2, 0, 4);

        SparseMatrix transposedMatrix = sparseMatrix.transpose();

        System.out.println("Original Matrix:");
        printMatrix(sparseMatrix);

        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix);
    }

    public static void printMatrix(SparseMatrix matrix) 
    {
        for (int row = 0; row < matrix.numRows; row++) 
        {
            for (int col = 0; col < matrix.numCols; col++) 
            {
                System.out.print(matrix.get(row, col) + " ");9
            }
            System.out.println();
        }
    }
}