public class StringPalindromeCheck 
{
    public static void main(String[] args) 
    {
        String inputString = "mom"; 
        // Change this to the string you want to check
        if (isPalindrome(inputString)) 
        {
            System.out.println(inputString + " is a palindrome.");
        } 
        else
         {
            System.out.println(inputString + " is not a palindrome.");
        }
    }
    
    public static boolean isPalindrome(String str) 
    {
        str = str.toLowerCase(); 
        // Convert the input string to lowercase for case-insensitive comparison
        int left = 0;
        int right = str.length() - 1;
        while (left < right) 
        {                                                               
            if (str.charAt(left) != str.charAt(right)) 
            {
                return false; 
                // If characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        
        return true; 
        // If the loop completes without returning false, it's a palindrome
    }
}

