//program to compute discount
import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double discount;
        System.out.println("Enter the price of the item:");
        double price=scanner.nextDouble();
        if(price>5000){
            discount=price*0.1;
        }
        
        else if(price>=1000 && price <=5000){
            discount=price*0.05;
        }
        else{
            discount=0;
        }
        double finalPrice=price-discount;
        System.out.println("Initial price " +price);
        System.out.println("Discount " +discount);
        System.out.println("Final price " +finalPrice);
        scanner.close();
        
        }
}