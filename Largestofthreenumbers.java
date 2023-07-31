import java.util.Scanner;
public class Largestofthreenumbers 
{
   public static void main(String[]args)
   {
    int a,b,c,largest,temp;
    //object of the Scanner class
    Scanner sc= new Scanner(System.in);
    //reading input from the user
    System.out.println("Enter the first number:");
    a=sc.nextInt();
    System.out.println("Enter the seecond number");
    b=sc.nextInt();
    System.out.println("Enter the third number:");
    c=sc.nextInt();
    //comparing a and b storing the largest number in temp variable
    temp=a>b?a:b;
    //comparing the temp variable with c and storing the result in the varible
    largest=c>temp?c:temp;
    System.out.println("the largest number is:"+largest);
   } 
}
