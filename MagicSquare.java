public class MagicSquare {

    public static void generateMagicSquare(int n) 
    {
        int[][] magicSquare = new int[n][n];
        int num = 1;
        int row = 0;
        int col = n / 2;

        while (num <= n * n) 
        {
            magicSquare[row][col] = num;
            num++;
            
            int newRow = (row - 1 + n) % n;
            int newCol = (col + 1) % n;

            if (magicSquare[newRow][newCol] != 0) 
            {
                row = (row + 1) % n;
            } 
            else 
            {
                row = newRow;
                col = newCol;
            }
        }

        // Print the magic square
        System.out.println("Magic Square of order " + n + ":");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(magicSquare[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        int order = 3; // Change this value to generate magic square of different orders
        generateMagicSquare(order);
    }
}