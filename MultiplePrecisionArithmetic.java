import java.math.BigInteger;
public class MultiplePrecisionArithmetic
{
    public static void main(String[] args) 
    {
        // Create BigIntegers
        BigInteger num1 = new BigInteger("123456789012345678901234567890");
        BigInteger num2 = new BigInteger("987654321098765432109876543210");

        // Perform arithmetic operations
        BigInteger sum = num1.add(num2);
        BigInteger difference = num1.subtract(num2);
        BigInteger product = num1.multiply(num2);
        BigInteger quotient = num1.divide(num2);
        BigInteger remainder = num1.remainder(num2);

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
