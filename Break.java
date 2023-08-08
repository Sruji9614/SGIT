 public class Break{
    public static void main(String[] args) 
    {
        int targetNumber = 5;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Current number: " + i);
            
            if (i == targetNumber) {
                System.out.println("Target number found! Exiting loop.");
                break; // Exit the loop when the target number is found
            }
        }
        
        System.out.println("Loop finished.");
    }
}