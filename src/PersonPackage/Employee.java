
package PersonPackage;

import java.util.Scanner;

public class Employee extends Person{   
    
    public String position;
    float salary;
    int id;
    Scanner scanner = new Scanner(System.in);
    
    public Employee() {
        // Call superclass constructor with default values or remove this line if no default values are needed
        super("Default DoB", "Default Name", 0); // Example default values
    }
    public Employee(String DoB, String name, int age, String position, float salary, int id){
        super(DoB, name, age);
        this.position = position;
        this.salary = salary;
        this.id = id;
    }
    
    public void scanEmployee() {
        System.out.println("=== Enter Employee Details ===");
         
        super.scanPerson();

        System.out.print("Enter position: ");
        this.position = scanner.nextLine();

        System.out.print("Enter salary: ");
        this.salary = scanner.nextFloat();

        System.out.print("Enter ID: ");
        this.id = scanner.nextInt();
        
        System.out.println("===========================================================");
    }
    
    @Override
    public String toString() {
    String salary = String.format("%.2f", this.salary);
    
    return super.toString() +
           "\nPosition: " + position + "\n" +
           "Salary: " + salary + "$\n" +
           "ID: " + id + "\n";
    }
}
