package PersonPackage;

import java.util.Scanner;

public class Person {
    
    
    private String DoB;
    private String name;
    private int age;
    Scanner scanner = new Scanner(System.in);
    
    public Person(String DoB, String name, int age){
        this.DoB = DoB;
        this.name = name;
        this.age = age;
    }
    
    public void scanPerson(){
    
        System.out.print("Date of Birth: ");
        this.DoB = scanner.nextLine();

        System.out.print("Name: ");
        this.name = scanner.nextLine();

        System.out.print("Age: ");
        this.age = scanner.nextInt();
    
    }
    
    @Override
    public String toString(){
        return "\nDate of Birth: " + DoB +
               "\nname: " + name +
                "\nage: " + age;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getDoB(){
        return this.DoB;
    }
    
    public int getAge(){
        return this.age;
    }
}
