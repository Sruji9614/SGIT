import java.util.Arrays;
public class Radixsort 
{
    //using counting sort to sort the array elements in the basis of significant places
    void countingsort(int array[], int size, int places)
    {
        int[]output=new int[size +1];
        int max = array[0];
        for (int  i=1; i<size;i++)
        {
            if(array[i]>max)
                max = array[i];
            
        }
        int[] count=new int [max + 1];
            for(int i=0;i<max;i++)
            count[i]=0;
            //calculate count of elements
            for(int i=0;i<size;i++)
            count[(array[i]/places)% 10]++;
            //calculate cumulative count
            for(int i=1;i<size;i++)
            array[i]=output[i];
    }
    //function to get the largest element from an array
    int getMax(int array[],int n)
    {
        int max=array[0];
        for(int i=1;i<n;i++)
        if(array[i]>max)
        max=array[i];
        return max;
    }
    //main function to implement radix sort
    void radixsort(int array[],int size)
    {
        //get maximum elements
        int max=getMax(array,size);
        //apply counting sort to sort elements based on place value.
        for (int place=1; max/place>0;place*=10)
        countingsort(array,size,place);
    }
    //Driver code
    public static void main(String args[])
    {
        int[]data={121,432,564,23,1,45,788};
        int size=data.length;
        Radixsort rs= new Radixsort();
        rs.radixsort(data,size);
        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
    }
 