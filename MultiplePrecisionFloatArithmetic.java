import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class MultiplePrecisionFloatArithmetic 
{
    public static void main(String[] args) 
    {
        // Define precision and rounding mode
        int precision = 50;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        MathContext mathContext = new MathContext(precision, roundingMode);

        // Create BigDecimal instances for your floating-point values
        BigDecimal value1 = new BigDecimal("0.1", mathContext);
        BigDecimal value2 = new BigDecimal("0.2", mathContext);

        // Perform arithmetic operations
        BigDecimal sum = value1.add(value2, mathContext);
        BigDecimal difference = value1.subtract(value2, mathContext);
        BigDecimal product = value1.multiply(value2, mathContext);
        BigDecimal quotient = value1.divide(value2, mathContext);

        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
