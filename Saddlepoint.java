public class Saddlepoint 
{
    public static void main(String args[])
    
    {
        //install a matrix
        int[][]matrix={{1,2,3},{4,5,6}{7,8,9}};
        int m=3,k;
        //variable to store min and max elements
        int min=0,max=0;
        int[][]index=new int[3][3];
        System.out.println("the matrix is:\n");
        int i,j;
        //loop for rows
        for(i=0;i<m;i++)
        {
            //inner loop for coloumns
            for(j=0;j<m;j++)
            {
                System.out.print(matrix of [i][j]"");
            }
            System.out.println();
        }
       // to find the sadle points we use this logic
       //to find min ele in a row
       for(i=0;i<m;i++)
       {
        min=matrix[i][0];
        for(j=0;j<m;j++)
        {
            if(min>=matrix[i][j])
        }
        min=matrix[i][j];
        index[0][0]=i;
        index[0][1]=j;
       }
    }
    //finds the maximum element in the same coloumn
    j=index[0][1];
    max=matrix[0][j];
    for(k=0;k<m;k++)
    {
        if(max<=matrix[k][j])
        {
            max =matrix[i][j];
            index[1][0]=k;
            index[1][1]=j;
        }
    }
    //sadlepoint is the minimum of a row and maximum of the coloumn
    if(min==max)
    {
        if(index[0][0] ==index[1][0]&&index[0][1]==index[1][1])
        {
            System.out.print("\nSaddlepoint in the matrix is at index:("index[0].index[0][1]+"):"+max+"\n");
        }
    }
    }

