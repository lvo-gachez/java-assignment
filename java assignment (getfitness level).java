
//program to determine user fitness level
import java.util.Scanner;
public class FitnessLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your steps: ");
        int steps = scanner.nextInt();
        String fitnessLevel;
        if (steps >= 10000) {
            fitnessLevel = "Excellent";
        } else if (steps >= 7000) {
            fitnessLevel = "Good";
        } else if (steps >= 5000) {
            fitnessLevel = "Average";
        } else {
            fitnessLevel = "Poor";
        }
        System.out.println("Your fitness level is: " + fitnessLevel);

        
        scanner.close();
    }
}

