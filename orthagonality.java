public class orthagonality 
{
    /*static int Max = 100;*/
    static boolean isOrthogonal(int [][]a, int m, int n)
    {
        if(m ! = n)
        return false;
        //find transpose
        int [] []prod = new int[n][n]; 
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int sum=0;
                for(int k=0;k<n;k++)
                {
                    sum= sum+(a[i][k]*a[j][k]);
                }
                prod[i][j] = sum;
            }
        }
        //cheeck wheather tyhe product is a identify matrix
        for(int i =0; i<n; i++)
        {
            for(int j=0;j<n;j++)
            {
                if (i !=j && prod[i][j] !=0)
                return false;
                if(i==j && prod[i][j] !=1)
                return false;
            }
        }
        return true;
    }
   static void main(String[]args)
   {
    int [][]a={{1,0,0},{0,1,0},{0,0,1}};
    if(isOrthogonal(a,3,3))
    System.out.println("yes");
    else 
        System.out.println("no");
   }
}

