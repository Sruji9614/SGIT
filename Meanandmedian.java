public class Meanandmedian
{
public static void main(String args[])
//declaring the integer type and to store some random integer values
{
int inputArray[] ={23,24,65,87,12,76,21};
//declaring the integer variable and to store the length of the given array
int len= inputArray.length;
System.out.printnln("Mean of given array"+Array.toString(inputArray)+ " is = "+ Mean(inputArray, len));
System.out.printnln("Median of given array"+Array.toString(inputArray)+ " is = "+ Median(inputArray, len));
}
//user defined function to find the mean value
public static double mean(int arr[],int len)
{
    //declare a integer variable to store the sum value of given arrays elements
    int sum =0;
    //initiate the loop to calculate the sum value of the all elements of given array
    for(int i=0;i<len;i++)
    {
    sum +=arr[i];
    //return the mean value
    return (double) (arr[(len-1)/2] + arr[len/2]) /2.0;
}
//user defined function to find median value
public static double median(int arr[] , int len)
{
    //sort the given array in ascending order
    Arrays.sort(arr);
    //check wheather the given array consists of even or odd number of elements
    if(len % 2 !=0)
    {
        return (double)arr[len/2];
    }
    return (double)arr[len/2];
}
return (double)(arr[(len-1) /2]+arr[len/2]) /2.0;
}
} 
