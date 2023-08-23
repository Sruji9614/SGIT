import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time in 12-hour format (hh:mm AM/PM): ");
        String time12 = sc.nextLine();
        
        String time24 = convertTo24HourFormat(time12);
        
        System.out.println("Time in 24-hour format: " + time24);
    }
    
    public static String convertTo24HourFormat(String time12) 
    {
        String[] parts = time12.split(" ");
        String timePart = parts[0];
        String ampmPart = parts[1];
        
        String[] timeParts = timePart.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);
        
        if (ampmPart.equals("PM") && hours != 12) {
            hours += 12;
        } else if (ampmPart.equals("AM") && hours == 12) {
            hours = 0;
        }
       String hoursStr = String.format("%02d", hours);
     String minutesStr = String.format("%02d", minutes);
        
     return hoursStr + ":" + minutesStr;
    }
}
