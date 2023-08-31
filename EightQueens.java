public class EightQueens {

    private static final int N = 8;
    private static int[] queens = new int[N];

    private static boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || Math.abs(queens[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    private static void solve(int row) {
        if (row == N) {
            printQueens();
            return;
        }

        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) 
            {
                queens[row] = col;
                solve(row + 1);
            }
        }
    }

    private static void printQueens() {
        for (int i = 0; i < N; i++) 
        {
           for (int j = 0; j < N; j++) {
                if (queens[i] == j) {
                    System.out.print("Q ");
                }
                 else {
                    System.out.print(". ");
                }
            }
            System.out.println();
            
        }
       
        System.out.println();
    }
    public static void main(String[] args) {
        solve(0);
    }
}
