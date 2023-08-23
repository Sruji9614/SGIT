import java.util.Arrays;
import java.util.Scanner;
public class SumOfAnArray {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		 long minSum = 0;
	     long maxSum = 0;
	        
	     for (int i = 0; i < arr.length - 1; i++) 
	     {
	            minSum += arr[i];
	            maxSum += arr[arr.length - 1 - i];
	       }
	        
	        System.out.println(minSum +"  "+maxSum);
	   }
}