import java.io.*;
import java.util.*;

public class FscanfAndFprintf 
{
    public static void main(String[] args) 
    {
        // Writing to a file using fprintf (equivalent in Java: PrintWriter)
        try (PrintWriter writer = new PrintWriter("output.txt")) 
        {
            int intValue = 42;
            double doubleValue = 3.14;
            String stringValue = "Hello, Java!";
            
            writer.printf("Integer: %d%n", intValue);
            writer.printf("Double: %.2f%n", doubleValue);
            writer.printf("String: %s%n", stringValue);  
        } catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
        
        // Reading from a file using fscanf (equivalent in Java: Scanner)
        try (Scanner scanner = new Scanner(new File("input.txt"))) 
         {
            int readInt = scanner.nextInt();
            double readDouble = scanner.nextDouble();
            String readString = scanner.next();
            
            System.out.println("Read Integer: " + readInt);
            System.out.println("Read Double: " + readDouble);
            System.out.println("Read String: " + readString);
        
        } 
         catch (FileNotFoundException e) 
         {
            e.printStackTrace();
        }
    }
}
