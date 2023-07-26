import java.util.Scanner;
class Integerdivisibility
{
    public static void main(String[]args){
    int n;
Scanner s = new Scanner(System.in);
System.out.println("enter the number");
n=s.nextInt();
 int m;
System.out.println("enter the number");
m=s.nextInt();
if(n%m==0)
{
    System.out.println(n+"is divisible by m");
}
else
{
    System.out.println(n+"is not divisible by m");
}
} 
}  