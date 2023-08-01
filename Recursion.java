public class Recursion
{
    //function to return minimum element using recursion
    public static int findMinRec(int a[],int n)
    {
        // if size = 0 means whole array
        //has been traversed
        if(n==1)
        return A[0];
        
        return Math.min(a[n-1], findMinRec(A, n-1));
    }     
    //Driver code
    public static void main(String [] args)
    {
        int a[] ={1,4,45,6,-50,10,2};
        int n=A.length;
        //Function Calling
        System.out.println(findMinRec(A,n));  
    }
}
