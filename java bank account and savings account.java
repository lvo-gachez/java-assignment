/*bank account and savings account
J77-10881-2024
ELVIS GACHERU
BSC IT*/
import java.util.Scanner;

class BankAccount{
    double balance;
    BankAccount(double balance){
        this.balance=balance;
    }
    void deposit(double amount){
        balance += amount;
    }
}
class SavingsAccount extends BankAccount{
    SavingsAccount(double balance){
    super(balance);
}
void addIntrest(){
    balance=balance+ (balance * 0.05);
 }
}
 
 public class Main{
     public static void main(String[] args){
         Scanner scanner= new Scanner(System.in);
         SavingsAccount acc= new SavingsAccount(0);
         System.out.println("Enter amount to deposit: ");
         double amount=scanner.nextDouble();
            acc.deposit(amount);
            acc.addIntrest();
      
      System.out.println("Final balance after intrest: "+acc.balance);
     }
 }