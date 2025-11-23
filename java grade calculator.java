
//grade calculator
import java.util.Scanner;

class student{
    String name;
    int marks;
//constructor
    public student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
    class GradeCalculator {
        public string calculateGrade(double marks) {
            if (marks >= 90) {
                return "A";
            } else if (marks >= 75) {
                return "B";
            } else if (marks >= 50) {
                return "C";
            } else {
                    return "D";}
            }
        } 
        Public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                System.out.print("Enter student marks: ");
                int marks = scanner.nextInt();
                student student = new student(name, marks);
                
                String grade = student.calculateGrade(marks);
                student.displayDetails();
                System.out.println("Grade: " + grade);
                
                scanner.close();
            }
        }
    }
