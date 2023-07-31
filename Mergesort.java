public class Mergesort 
{
    void merge(int arr[],int 1,int m, int r)
    {
        int n1=m-1 +1;
        int n2= r-m;
        int L[] =new int[n1];
        int R[] =new int[n2];
        for (int i=0;i<n1;++i)
        L[i] = arr[1+i];
        for (int j=0;j<n2;++j)
        R[j] = [m+1+j];
        int i=0,j=0;
        int k=1;
        while (i<n1 && j<n2)
        {
            if (L[i] <= R[J])
            {
                arr[k] =L[i];
               i++; 
               k++;
            }
            else
            {
                arr[k] =R[j];
                j++;
                k++;
            }
            while(i<n1)
            {
                arr[k]=L[i];
                i++;
                k++;
            }
            while(j<n2)
            {
                arr[k] =R[j];
                j++;
                k++;
            }
        }
        void sort(int arr[] , int 1, int r)
        {
            if(1<r)
            {
                int m = 1+(r-1)/2;
            }
            sort(arr,1,m);
            sort(arr, m+1,r);
            merge(arr, 1 ,m, r);
        }
    }
    static void printArray(int arr[])
    {
        int n=arr.length;
        for(int i=0; i<n;++i)
        System.out.print(arr[i] + "");
        System.out.println();
    }
        public static void main(String args[])
        {
            int arr[] ={12, 11, 13, 5, 6, 7};
            System.out.println("Given Array");
            printArray(arr);
            Mergesort ob =new Mergesort();
            ob.sort(arr,0,arr.length-1);
            System.out.println(*\nSorted Array);
            printArray(arr);
        }
        }
  
