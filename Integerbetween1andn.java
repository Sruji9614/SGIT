import java.util.Scanner;
public class Integerbetween1andn
 {
    public static void main(String[]args)
    {
    Scanner s= new Scanner(System.in);
    int n;
     {
        System.out.println("enter the number");
        n=s.nextInt();
    }
    int m;

    {
        System.out.println("enter the number");
        m=s.nextInt();
    }
    
   for(int i=0;i<=n;i++)
   {
    if(i%m==0)
    {
        System.out.println(i +"is divisible by"+ m);
    }
}

}
 }

 
