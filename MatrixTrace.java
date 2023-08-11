public class MatrixTrace 
{
    public static void main(String[] args) 
    {
        int rows = 3;
        int columns = 3;

        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int trace = 0;

        // Computing the trace of the matrix
        for (int i = 0; i < rows; i++) 
        {
            trace += matrix[i][i];
        }

        // Displaying the result
        System.out.println("Trace of the matrix: " + trace);
    }
}