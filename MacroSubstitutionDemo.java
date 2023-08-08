public class MacroSubstitutionDemo 
{
    public static void main(String[] args)
    {
        int num = 75;
        if (isValueWithinLimit(num)) 
        {
            System.out.println("Value is within the limit");
        } 
        else 
        {
            System.out.println("Value exceeds the maximum");
        }
    }
    public static boolean isValueWithinLimit(int value) 
    {
        final int MAX_VALUE = 100;
        return value <= MAX_VALUE;
    }
}