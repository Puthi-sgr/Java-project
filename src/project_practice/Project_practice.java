package project_practice;

import java.util.Scanner;
import PersonPackage.*;
import java.util.ArrayList;

public class Project_practice {
    public static void main(String[] args) {
        
        int option;
        Character insertionChoice;
                
        Employee employee1 = new Employee("1/12/02", "Puthi", 18, "software engineer", 4000, 1);
        Employee employee2 = new Employee("1/12/02", "Lolo", 18, "Developer", 2000, 2);
        Customer customer1 = new Customer("1/12/02", "Dada", 20, 012312, 1);
        Customer customer2 = new Customer("21/1/99", "Dodo", 20, 012312, 2);
        
        ArrayList<Employee> EmployeeList = new ArrayList<>(); 
        ArrayList<Customer> CustomerList = new ArrayList<>();
        
        
        
        EmployeeList.add(employee1);
        EmployeeList.add(employee2);
        CustomerList.add(customer1);
        CustomerList.add(customer2);
        
        System.out.println("=============================================");
        System.out.println("|          Welcome to the Registration       |");
        System.out.println("|                  System                    |");
        System.out.println("=============================================");
        System.out.println("|                                             |");
        System.out.println("|          Select an Option:                  |");
        System.out.println("|          1. Register                        |");
        System.out.println("|          2. Display                         |");
        System.out.println("|          3. Update                          |");
        System.out.println("|          4. Exit                            |");
        System.out.println("|                                             |");
        System.out.println("=============================================");
        
        System.out.println(CustomerList);
               
        System.out.print("Enter your choice: ");
          

        Scanner scanner = new Scanner(System.in);
        option = scanner.nextInt();
        //swtich option
        switch(option) {
            case 1:
                
                do{
                System.out.println("=============================================");
                System.out.println("|                Insertion                   |");
                System.out.println("=============================================");
                System.out.println("|                                             |");
                System.out.println("|   C for Customers                           |");
                System.out.println("|   E for Employees                           |");
                System.out.println("|                                             |");
                System.out.println("=============================================");
                
                insertionChoice = scanner.next().charAt(0);
                
                }while(insertionChoice != 'e' && insertionChoice != 'E' && insertionChoice != 'c' && insertionChoice != 'C');
                //Scans for amount of people to be inserted
                System.out.print("Amount of People to be inserted: ");
                int numberOfPeople = scanner.nextInt();
                
                if(numberOfPeople > 0){
                    if(insertionChoice == 'e' || insertionChoice == 'E'){            
                        for(int i = 0; i < numberOfPeople; i++){
                            Employee temp = new Employee();
                            temp.scanEmployee();
                            EmployeeList.add(temp);
                        }                             
                        System.out.println(EmployeeList);
                    }else if(insertionChoice == 'c' || insertionChoice == 'C'){
                        for(int i = 0; i < numberOfPeople; i++){
                            Customer temp = new Customer();
                            temp.scanCustomer();
                            CustomerList.add(temp);
                        }  
                        System.out.println(CustomerList);
                    }
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("default");
                break;
        }
    }
    
}
