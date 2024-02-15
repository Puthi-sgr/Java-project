package PersonPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Customer extends Person{
    
    int contactNumber;
    int customerId;
    String customerFilePath = "C:\\Users\\Dell\\Documents\\CODE stuff\\NetBeansProjects\\Project_practice\\src\\PersonPackage\\Customer.txt";
    File customerFile = new File(customerFilePath);
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
    
     public void writeToFileCustomer() throws IOException{
        if(customerFile.exists()){
           try{
                FileWriter CustomerWriter = new FileWriter(customerFilePath , true);
                CustomerWriter.write("\n{" + this.toString() + "\n}");
                CustomerWriter.flush();
                System.out.println("File insertion success.");
           }catch (IOException e) {           
                e.printStackTrace();
                System.err.println("Error writing to file: " + e.getMessage());             
           }
        }else{
            System.out.println("File does not exists.");
        }     
    }
    
    public int getContactNumber(){
        return this.contactNumber;
    }
    
    public int getCustomerId(){
        return this.customerId;
    }
}
