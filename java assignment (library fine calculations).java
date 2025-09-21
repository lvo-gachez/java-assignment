/*J77-10881-2024
 * Name: Elvis Gacheru
 * Course: Bsc IT
 */
//program to calculate fine for overdue library books
import java.util.Scanner;
public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       //promp user to enter details
        System.out.print("Enter book id: ");
        String bookId = scanner.nextLine();
        System.out.print("Enter due date (DD-MM-YYYY): ");
        String dueDate = scanner.nextLine();
        System.out.print("Enter return date (DD-MM-YYYY): ");
        String returnDate = scanner.nextLine();

        //Calculate days overdue
        int daysOverdue = returnDate - dueDate; 
        //calculate fine rate and amount
        int finerate =0;
        int fineamount =0;
        if(daysOverdue <=0){
            finerate =0;
            fineamount =0;       
        } else if(daysOverdue <=7){ 
            finerate =20;
            fineamount = daysOverdue * finerate;
        } else if(daysOverdue <=14){
            finerate =50;
            fineamount = daysOverdue * finerate;
        } else {
            finerate =100;
            fineamount = daysOverdue * finerate;
        }
        system.out.println("Book ID: " + bookId);
        system.out.println("dueDate: " + dueDate);
        system.out.println("returnDate: " + returnDate);
        system.out.println("Days Overdue: " + daysOverdue);
        system.out.println("Fine Rate: " + finerate);
        system.out.println("Total Fine Amount: " + fineamount);
        scanner.close();
    }
}
