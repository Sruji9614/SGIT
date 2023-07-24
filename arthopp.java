import java.util.Scanner;
public class arthopp 
{
 public static void main(String[]args)
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    int num=input.nextInt();
    int[] arr1=new int[num];
    int[] arr2=new int[num];
    int[] add=new int[num];
    int[] sub=new int[num];
    int[] mul=new int[num];
    int[] div=new int[num];
    flot[] mod=new float[num];
    for(int i=0;i<num;i++);
    {
        arr1[i]=input.nextInt();
    }
    for (int i=0;i<num;i++);
    {
       arr2[i]=input.nextInt(); 
    }
    for(int i=0;i<num;i++)
    {
        add[i]=arr1[i]+arr2[i];
        sub[i]=arr1[i]-arr2[i];
        mul[i]=arr1[i]*arr2[i];
        div[i]=arr1[i]/arr2[i];
        mod[i]=arr1[i]%arr2[i];
    }
    System.out.println("\n Addtion\t Subtraction\ t Multiplication\t Division\t Module");
    for(int i=0;i<num;i++);
    {
         System.out.print(add[i]+"\t");
         System.out.print(sub[i]+"\t");
         System.out.print(mul[i]+"\t");
         System.out.print(div[i]+"\t");
         System.out.print(mod[i]+"\t");
         System.out.print("\n");
    }
 }   
}
