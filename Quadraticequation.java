import java.util.Scanner;

public class Quadraticequation 
{
  public static void main(String[]args)
  {
     Scanner s= new Scanner(System.in);
    System.out.print("enter the value of a");
    double a=s.nextDouble();
    System.out.print("enter the value of b");
    double b=s.nextDouble();
    System.out.print("enter the value of c");
    double c=s.nextDouble();
    double d=b*b-4.0*a*c;
    if(d>0.0)
    {
        double r1=(-b+Math.pow(d,0.5))/(2.0*a);
         double r2=(-b-Math.pow(d,0.5))/(2.0*a);
        System.out.println("The root are"+r1+"and"+r2);   
    }
    else if(d==0)
    {
      double r1=-b/(2.0*a);
      System.out.println("the root is"+r1);
    }
    else
    {
        System.out.println("roots are not real.");
    }
    }
  }    
