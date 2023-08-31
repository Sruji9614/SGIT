public class StringReversal 
{
    public static String reverseNCharacters(String str, int n) 
    {
        if (n <= 0 || n > str.length()) 
        {
            return str;
        }
         else 
        
        {
            char firstChar = str.charAt(n - 1);
            String restOfString = reverseNCharacters(str.substring(0, n - 1), n - 1);
            return firstChar + restOfString;
        }
    }

    public static void main(String[] args) 
    {
        String input = "Hello, World!";
        int n = 5; // Number of characters to reverse
        String reversed = reverseNCharacters(input, n);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}

