public class NestedMacros
{
    // Outer method
    public static void outerMethod() 
    {
        System.out.println("This is the outer method.");
        nestedMethod();
    }

    // Nested method
    public static void nestedMethod() 
    {
        System.out.println("This is the nested method.");
    }
    public static void main(String[] args) 
    {
        System.out.println("Calling the outer method:");
        outerMethod();
    }
}