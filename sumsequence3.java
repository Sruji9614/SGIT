public class sumsequence3 
{
    static long facorial(int n)
    {
  int res=1;
  for (int i=2;i<=n;i++)
  res *=i;
  return res;
} 
static double sum(int n)
{
    long sum=0;
    for(int i=1;i<=n;i++)
    sum+=1.0/(i);
    return sum;
}
public static void main(String args[])
{
 int n = 5;
 System.out.println( sum(n)); 
}  
} 

