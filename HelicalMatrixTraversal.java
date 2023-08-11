public class HelicalMatrixTraversal {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 3;
        int[][] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 },
            { 10, 11, 12 }
        };

        traverseHelically(matrix, rows, columns);
    }

    static void traverseHelically(int[][] matrix, int rows, int columns) 
    {
        int top = 0, bottom = rows - 1, left = 0, right = columns - 1;

        while (top <= bottom && left <= right) 
        {
            // Traverse top row
            for (int i = left; i <= right; i++) 
            {
                System.out.print(matrix[top][i] + " ");
            }
            top++;
            // Traverse right column
            for (int i = top; i <= bottom; i++) 
            {
                System.out.print(matrix[i][right] + " ");
            }
            right--;
            // Traverse bottom row (if applicable)
            if (top <= bottom) 
            {
                for (int i = right; i >= left; i--) 
                {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }
            // Traverse left column (if applicable)
            if (left <= right) 
            {
                for (int i = bottom; i >= top; i--) 
                {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}