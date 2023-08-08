public class TypeCasting 
{
    public static void main(String[] args) 
    {
        // Implicit type casting (widening)
        int numInt = 100;
        long numLong = numInt; 
        // No need for explicit casting from int to long
        System.out.println("Implicit casting: int to long");
        System.out.println("numInt: " + numInt);
        System.out.println("numLong: " + numLong);
        // Explicit type casting (narrowing)
        double numDouble = 123.456;
        int numIntExplicit = (int) numDouble; 
        // Explicit casting from double to int
        System.out.println("\nExplicit casting: double to int");
        System.out.println("numDouble: " + numDouble);
        System.out.println("numIntExplicit: " + numIntExplicit);

        // Be aware of potential data loss when casting
        int largeInt = 2147483647; 
        // Maximum value for int
        short shortValue = (short) largeInt; 
        // Explicit casting to short
        System.out.println("\nCasting with potential data loss");
        System.out.println("largeInt: " + largeInt);
        System.out.println("shortValue: " + shortValue);
    }
}