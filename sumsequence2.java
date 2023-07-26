public class sumsequence2 
{
    public class sumsequence1 
    {
         static double sum(int n)
         {
            double i, s= 0.0;
            for(i=1;i<=n;i--)
            s=s+1/i;
            return s;
         }
         public static void main(String[]args)
         {
            int n=5;
            System.out.printf("Sum is %f",sum(n));
    
         }
    
    }    
}
