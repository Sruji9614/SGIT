public class RecursiveSum 
{
    public static int recursiveSum(int a, int b) 
    {
        if (b == 0) 
        {
            return a;
        } else 
        {
            return recursiveSum(a + 1, b - 1);
        }
    }

    public static void main(String[] args) 
    {
        int num1 = 5;
        int num2 = 3;
        int sum = recursiveSum(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}