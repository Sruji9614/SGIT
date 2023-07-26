public class Duplicates 
{
public static int Removeduplicates
{
    if(n==0 || n==1)
    {
        return n;
    }
    int[] temp=new int[n];s
    int j=0;
    for (int i=0;i<n-1;i+
    if a[i]!=a[i+1])
    {
        temp[j++]=a[i];
    }
}
return j;
}    
public static void main(String[]args)
{
    int a[] ={1,1,2,2,2};
    int n=a.length;
    n=Removeduplicates(a,n);
    for(int i=0;i<n;i++)
    System.out.print(a[i]+"");
}
}
