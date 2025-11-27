/*J77-10881-2024
ELVIS GACHERU
BSC IT */
//system manages employees using inheritance
import java.util.Scanner;
 class Employee{
     String name;
     int salary;
     
     Employee(String name,int salary){
         this.name=name;
         this.salary=salary;
       }
       void displayInfo(){
           System.out.println("Name: "+name);
           System.out.println("Salary: "+salary);
       }
     }
     
     class Lecturer extends Employee{
         String department;
         Lecturer(String name,int salary,String department){
         super(name,salary);
         this.department=department;
     }
       @Override
      void displayInfo(){
          super.displayInfo();
          System.out.println("Department: "+ department);
      }
     }
     public class Main{
         public static void main(String[]args){
             Scanner scanner=new Scanner(System.in);
             System.out.println("Enter name: ");
             String name=scanner.nextLine();
             System.out.println("Enter salary: ");
             int salary=scanner.nextInt();
             scanner.nextLine();
             
             System.out.println("Enter department: ");
             String department=scanner.nextLine();
             Lecturer lecturer= new Lecturer(name,salary,department);
             System.out.println("Lecturers details: ");
             lecturer.displayInfo();
         }
     }