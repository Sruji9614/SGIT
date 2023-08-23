public class PolynomialAddition 
{
    public static void main(String[] args) 
    {
        int[] poly1 = { 5, 3, 0, 2 }; // 5x^3 + 3x^2 + 2
        int[] poly2 = { 2, 1, 4 };    // 2x^2 + x + 4

        int maxDegree = Math.max(poly1.length, poly2.length);
        int[] result = new int[maxDegree];

        for (int i = 0; i < poly1.length; i++) 
        {
            result[i] ^= poly1[i]; // Bitwise XOR to add coefficients
        }

        for (int i = 0; i < poly2.length; i++)
         {
            result[i] ^= poly2[i]; // Bitwise XOR to add coefficients
        }

        System.out.print("Result: ");
        for (int i = 0; i < result.length; i++) 
        {
            System.out.print(result[i] + "x^" + i);
            if (i < result.length - 1) 
            {
                System.out.print(" + ");
            }
        }
    }
}
