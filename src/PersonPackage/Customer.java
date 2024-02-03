package PersonPackage;

import java.util.Scanner;

public class Customer extends Person{
    
    int contactNumber;
    int customerId;
    Scanner scanner = new Scanner(System.in);
    
    public Customer(){
        super("Default DoB", "Default Name", 0);
    }
    public Customer(String DoB, String name, int age, int contactNumber, int customerId){
        super(DoB, name, age);
        this.contactNumber = contactNumber;
        this.customerId = customerId;            
    }
    
    public void scanCustomer() {
         System.out.println("=== Enter Customer Details ===");
         
        super.scanPerson();

        System.out.print("Enter contact number: ");
        this.contactNumber = scanner.nextInt();

        System.out.print("Enter ID: ");
        this.customerId = scanner.nextInt();
      
        System.out.println("===========================================================");
    }
    
    @Override
    public String toString(){
        return super.toString() +
               "\nContact Number: " + contactNumber
               + "\nCustomer Id: " + customerId + "\n";
    }  
}
