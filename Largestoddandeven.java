import java.util.Scanner;
public class Largestoddandeven 
{
  public static void main(String[]args)
  {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the number of elements in an array:");
    int num =new input.nextInt();
    int[] arr=int [num];
    System.out.println("enter"+num+" integers");
    for(int i=0;i<num;i++)
    {
        arr[i]=input.nextInt();
    }
    int LargestOdd=Integer.MIN_VALUE;
    int largestEven=Integer.MIN_VALUE;
    for(int i=0;i<num;i++)
    {
        if(arr[i]%2!=0 && arr[i]>LargestOdd)
        {
            LargestOdd=arr[i];
        }
        else if(arr[i]%2==0 && arr[i]>largestEven)
        {
            largestEven=arr[i];
        }
    }
        System.out.println("The largest odd integer is:"+largestOdd);
       System.out.println("The largest even integer is:"+largestEven);
    
  }  
}
