import java.util.Scanner;
class Employee 
{
    int employeeId;
    String name;
    int age;
    String department;
    double salary;

    Employee(int employeeId, String name, int age, String department, double salary) 
    {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }
}
public class EmployeeRecordProcessing 
{
    public static void main(String[] args) 
    {
        final int MAX_EMPLOYEES = 5;
        Employee[] employees = new Employee[MAX_EMPLOYEES];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee records:");

        for (int i = 0; i < MAX_EMPLOYEES; i++) {
            System.out.println("Employee " + (i + 1));
            System.out.print("Employee ID: ");
            int employeeId = scanner.nextInt();
            scanner.nextLine(); 
            // Consume the newline character left by nextInt()
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Department: ");
            String department = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            employees[i] = new Employee(employeeId, name, age, department, salary);
            System.out.println();
        }

        scanner.close();

        System.out.println("Employee Records:");

        for (int i = 0; i < MAX_EMPLOYEES; i++) {
            System.out.println("Employee " + (i + 1));
            System.out.println("Employee ID: " + employees[i].employeeId);
            System.out.println("Name: " + employees[i].name);
            System.out.println("Age: " + employees[i].age);
            System.out.println("Department: " + employees[i].department);
            System.out.println("Salary: " + employees[i].salary);
            System.out.println();
        }
    }
}