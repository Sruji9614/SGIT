import java.util.Scanner;
public class ExponentialSeries
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        double result = 1.0; 
        // Initialize with the first term
        for (int i = 1; i <= terms; i++) 
        {
            double term = 1.0;
            for (int j = 1; j <= i; j++) 
            {
                term *= base; 
                // Calculate power of base for each term
            }
            term /= factorial(i); 
            // Divide by factorial of term number
            result += term;
        }
        System.out.println("Result: " + result);
        scanner.close();
    }
    // Function to calculate factorial of a number
    public static int factorial(int n) 
    {
        if (n == 0 || n == 1) 
        {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) 
        {
            fact *= i;
        }
        return fact;
    }
}