public class Magicsqureofamatrix 
{
  public static void main(String []args)
  {
          //Initialising and declaring matrix
           int mat[][] = {{ 13, 8, 15 }, { 14, 12, 10 }, { 9, 16, 11 }};
           int M = 3;
           //declare boolean to check for magic square or not
           boolean flag = false;
           
           //Initialising and declaring the diagonal sum as 0
           int sum1 = 0,sum2=0;
           
           //sum of the two diagonals 
           for (int i = 0; i < M; i++){
              sum1 += mat[i][i];
              sum2 += mat[i][M-1-i];
           }
           
           //check if sum of diagonals are unequal then it is not a magic square
           if(sum1!=sum2)
           flag = true; 
           for (int i = 0; i < M; i++) {
              
              
              int rowSum = 0, colSum = 0;
              
              //finding the sum of the rows and columns i.e. row and column
              for (int j = 0; j < M; j++)
              {
                 rowSum += mat[i][j];
                 colSum += mat[j][i];
              }
              
              //check if sum of rows, columns and diagonals are unequal then it is not a magic square
              if (rowSum != colSum || colSum != sum1)
                 flag = true; 
           }
           
           //checking and printing magic square
           if (!flag)
              System.out.println("Given matrix is a Magic Square");
           else
              System.out.println("Given matrix is a not a magic" + " Square");
        }
     } 
