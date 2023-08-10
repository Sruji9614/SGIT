import java.util.function.Function;

public class SimpsonsRule 
{
    // Function for which we want to find the area
    static double function(double x) 
    {
        return x * x; 
        // Replace this with your desired function
    }

    // Simpson's Rule to find the area under the curve
    static double simpsonsRule(double a, double b, int n) 
    {
        double h = (b - a) / n;
        double sum = function(a) + function(b);

        for (int i = 1; i < n; i += 2) 
        {
            sum += 4 * function(a + i * h);
        }

        for (int i = 2; i < n - 1; i += 2) 
        {
            sum += 2 * function(a + i * h);
        }

        return (h / 3) * sum;
    }

    public static void main(String[] args) 
    {
        double a = 0; 
        // Lower limit of integration
        double b = 2; 
        // Upper limit of integration
        int n = 4;    
        // Number of subintervals (even number)

        double area = simpsonsRule(a, b, n);
        System.out.println("Approximate area under the curve: " + area);
    }
}