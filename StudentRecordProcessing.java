// program to process student records using structures
import java.util.Scanner;
class Student 
{
    int rollNumber;
    String name;
    int age;
    double marks;

    Student(int rollNumber, String name, int age, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}
public class StudentRecordProcessing 
 {
    public static void main(String[] args) 
    {
        final int MAX_STUDENTS = 5;
        Student[] students = new Student[MAX_STUDENTS];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student records:");

        for (int i = 0; i < MAX_STUDENTS; i++) {
            System.out.println("Student " + (i + 1));
            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Marks: ");
            double marks = scanner.nextDouble();

            students[i] = new Student(rollNumber, name, age, marks);
            System.out.println();
        }

        scanner.close();

        System.out.println("Student Records:");

        for (int i = 0; i < MAX_STUDENTS; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Roll Number: " + students[i].rollNumber);
            System.out.println("Name: " + students[i].name);
            System.out.println("Age: " + students[i].age);
            System.out.println("Marks: " + students[i].marks);
            System.out.println();
        }
    }
}