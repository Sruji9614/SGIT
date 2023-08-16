public class CountCharacters
{
    public static void main(String[] args) 
    {
        String inputString = "Srujith Maddiboyina";
        int vowelsCount = 0;
        int consonantsCount = 0;
        int whitespaceCount = 0; 
        inputString = inputString.toLowerCase(); 
        // Convert the input string to lowercase for easier comparison
        for (int i = 0; i < inputString.length(); i++) 
        {
            char currentChar = inputString.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') 
            {
                vowelsCount++;
            } 
            else if (currentChar >= 'a' && currentChar <= 'z') 
            {
                consonantsCount++;
            } 
            else if (currentChar == ' ') 
            {
                whitespaceCount++;
            }
        }  
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);
        System.out.println("Number of whitespaces: " + whitespaceCount);
    }
}

