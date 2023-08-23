public class PolynomialAdditionUsingArray 
{
    public static void main(String[] args) 
    {
        int[] poly1 = {3, 0, 2}; // 3x^2 + 2
        int[] poly2 = {1, 4, 0, 2}; // x^3 + 4x^2 + 2

        int[] result = addPolynomials(poly1, poly2);

        System.out.print("Result: ");
        for (int i = 0; i < result.length; i++) 
        {
            if (result[i] != 0) 
            {
                System.out.print(result[i]);
                if (i < result.length - 1) 
                {
                    System.out.print("x^" + i + " + ");
                }
            }
        }
    }
    public static int[] addPolynomials(int[] poly1, int[] poly2) 
    {
        int maxLength = Math.max(poly1.length, poly2.length);
        int[] result = new int[maxLength]; 
        for (int i = 0; i < poly1.length; i++) 
        {
            result[i] += poly1[i];
        }
        for (int i = 0; i < poly2.length; i++) 
        {
            result[i] += poly2[i];
        }
        return result;
    }
}
