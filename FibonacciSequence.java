public class FibonacciSequence 
{
    public static int fibonacci(int n) 
    {
        if (n <= 0) 
        {
            return 0;
        } else if (n == 1) 
        {
            return 1;
        } else 
        {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) 
    {
        int n = 10; 
        // Adjust the value of n to generate the first n Fibonacci numbers
        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(fibonacci(i) + " ");
        }
    }
}