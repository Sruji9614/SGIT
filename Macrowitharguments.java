public class Macrowitharguments
{
    public static void main(String[] args) 
    {
        int a = 5;
        int b = 10;

        int result1 = addNumbers(a, b); // Using a method as a "macro"
        System.out.println("Result of addition: " + result1);

        int result2 = multiplyNumbers(a, b); // Using another method as a "macro"
        System.out.println("Result of multiplication: " + result2);
    }

    // Method to add two numbers
    public static int addNumbers(int x, int y) 
    {
        return x + y;
    }

    // Method to multiply two numbers
    public static int multiplyNumbers(int x, int y) 
    {
        return x * y;
    }
}