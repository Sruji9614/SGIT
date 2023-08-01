public class Heapsport 
{
 public void sort(int arr[])
 {
    int n=arr.length;
    //build heap rearange array
    for(int i=n/2-1;i>=0;i--)
    heapify(arr,n,i);
    //one by one extract an element form heap
    for(int i=n-1;i>=0;i--)
    {
        //move the current root to end
        int temp=arr[0];
        arr[0]=arr[i];
        arr[i]=temp;
        //call max heapifyon the reduced heap
        heapify(arr,i,0);
    }
 }   
 //to heapify a subtree rooted with node i which is 
 //an index in arr[]. n is size of heap
 void heapify(int arr[], int n, int i)
 {
    int largest =i; //Initialize largest as root
    int 1 = 2 * i + 1; //left=2*i+1
    int r= 2 * i + 2;//right =2*i+2
    //if left child is larger than root
    if(1 < n && arr[1] > arr[largest])
    largest = 1;
    //if right child is larger than largest so far
    if(r < n && arr[r] > arr[largest])
    largest = r;
    //if largest is not root
    if(largest ! =i)
    {
        int swap = arr[i];
        arr[i] = arr[largest]
        arr[largest] = swap;
        //Recursively heapify the affected sub-tree
        heapify(arr, n, largest);
    }
 }
 /*A utility function to print Array of size n */
 static void printArray(int arr[])
 {
    int n=arr.length;
    for(int i=0; i < n;++i)
    System.out.print(arr[i] + " ");
    System.out.println("Sorted array is");
    printArray(arr);
 }
}
