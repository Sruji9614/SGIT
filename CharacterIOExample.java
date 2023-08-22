import java.io.IOException;

public class CharacterIOExample {
    public static void main(String[] args) 
    {
        try 
        {
            // Read a character from the standard input (System.in)
            System.out.println("Enter a character:");
            int charInput = System.in.read(); // Reads the ASCII value of the character

            // Display the character and its ASCII value
            System.out.println("You entered: " + (char) charInput);
            System.out.println("ASCII value: " + charInput);

            // Write a character to the standard output (System.out)
            System.out.println("Writing the character to standard output:");
            System.out.flush(); // Flush the buffer
            System.out.write(charInput);
            System.out.flush(); // Flush the buffer
        }
         catch (IOException e)
          {
            e.printStackTrace();
        }
    }
}
