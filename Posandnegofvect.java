import java.util.Scanner;
import java.util.Arrays;
public class Posandnegofvect 
{
public static void main(String[]args)
{
    Scanner input=new Scanner(System.in);
    System.out.println("Ener The Size of the Vector");
    int n=input.nextInt();
    int[] vector=new int[n];
    for(int i=0;i<n;i++)
    {
        vector[i]=input.nextInt();
    }
    int posSum=0;
    int negSum=0;
    for(int i=0;i<n;i++)
    {
        vector[i]=input.nextInt();
    }
    int posSum=0;
    int negSum=0;
    for(int i=0;i<n;i++)
    {
        if(vector[i]>0)
        {
            posSum+=vector[i];
        }
        elseif(vector[i]<0)
        {
            negSum+=vector[i];
        }
    }
    System.out.println("vector:"+Arrays.toString(vector));
     System.out.println("sum of the positive elements:"+posSum);
     System.out.println("sum of negative elements:"+negSum);


    }
}
