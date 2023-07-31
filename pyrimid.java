import java.util.Scanner;
public class pyrimid 
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
    //taking a no.of rows value from the user
    System.out.println("how many rows you want in your pyramid?");
    int noOfRows =sc.nextInt();
    //initializing rowCount with 1
    int rowCount =1;
    System.out.println("here is your pyramid");
    //implementing the logic 
    for(int i= noOfRows; i>=1;i--)
    {
        //print the i*2 spaces at the begining of the each row
        for(int j=1;j<=i*2;j++)

            System.out.print(" ");
        }
        //printing j where j value will be from i to noOfRows
    } 
  }   
}
