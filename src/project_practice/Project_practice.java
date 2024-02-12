package project_practice;

import java.util.Scanner;
import PersonPackage.*;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;

public class Project_practice {
    public static void main(String[] args) {
        
        int option;
        Character insertionChoice;
        boolean isRunning = true;
                
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

        while(isRunning){
            System.out.println("=============================================");
            System.out.println("|          Welcome to the Registration       |");
            System.out.println("|                  System                    |");
            System.out.println("=============================================");
            System.out.println("|                                             |");
            System.out.println("|          Select an Option:                  |");
            System.out.println("|          1. Register                        |");
            System.out.println("|          2. Display                         |");
            System.out.println("|          3. Update                          |");
            System.out.println("|          4. Search                          |");
            System.out.println("|          5. Exit                            |");
            System.out.println("|                                             |");
            System.out.println("=============================================");

            
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
                        }else if(insertionChoice == 'c' || insertionChoice == 'C'){
                            for(int i = 0; i < numberOfPeople; i++){
                                Customer temp = new Customer();
                                temp.scanCustomer();
                                CustomerList.add(temp);
                            }  
                        }
                    }
                    break;
                case 2:
                    System.out.println("+-------------------------------+");
                    System.out.println("|       Display Information     |");
                    System.out.println("+-------------------------------+");
                    System.out.println("|   C. Display Customer         |");
                    System.out.println("|   E. Display Employee         |");
                    System.out.println("+-------------------------------+");


                    char displayChoice = scanner.next().toUpperCase().charAt(0);
                    if(displayChoice == 'C'){
                        System.out.println(CustomerList);
                    }else if(displayChoice == 'E'){
                        System.out.println(EmployeeList);
                    }                        
                    break;
                case 3:
                    
                    System.out.println("+-------------------------------+");
                    System.out.println("|       Update Information      |");
                    System.out.println("+-------------------------------+");
                    System.out.println("|   C. Update Customer         |");
                    System.out.println("|   E. Update Employee         |");
                    System.out.println("+-------------------------------+");
                    System.out.print("\nYour choice: ");
                        char updateChoice = scanner.next().toUpperCase().charAt(0);
                    boolean isFound = false;
                    do{        
                        //find index using id
                        System.out.print("\nEnter ID: ");
                        int updateId = scanner.nextInt();                 
                        if(updateChoice == 'C'){
                            for(int i = 0; i < CustomerList.size(); i++){
                                if(CustomerList.get(i).getCustomerId() == updateId){
                                    System.out.println("Selected Id has been found");
                                    Customer temp = new Customer();
                                    temp.scanCustomer();
                                    CustomerList.set(i, temp);
                                    isFound = true;
                                    break;
                                }
                            }       
                        }else if(updateChoice == 'E'){
                            for(int i = 0; i < EmployeeList.size(); i++){
                                if(EmployeeList.get(i).getId() == updateId){
                                    System.out.println("Selected Id has been found");
                                    Employee temp = new Employee();
                                    temp.scanEmployee();
                                    EmployeeList.set(i, temp);
                                    isFound = true;
                                    break;
                                }
                            }
                        }
                        if(!isFound){
                            System.out.println("Invalid id");
                        }
                    }while(!isFound);
                             
                    break;
                case 4: 
                    char searchChoice = scanner.next().toUpperCase().charAt(0);
                    int idSearch = scanner.nextInt();
                    isFound = false;
   
                    
                    if(searchChoice == 'E'){
                        for(int i = 0; i < EmployeeList.size(); i++){
                            if(idSearch == EmployeeList.get(i).getId()){
                                isFound = true;
                            }
                        }
                    }else if(searchChoice == 'C'){
                        for(int i = 0; i < CustomerList.size(); i++){
                            if(idSearch == CustomerList.get(i).getCustomerId()){
                                isFound = true;
                            }
                        }
                    }
                    
                    if(isFound){
                        System.out.println("found");
                    }else{
                        System.out.println("not found");
                    }
                case 5:
                    
                    isRunning = false;
                    break;
                default:
                    System.out.println("default");
                    break;
            }
        }
        
    }
    
}
