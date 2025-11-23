/*J77-10881-2024
ELVIS GACHERU
Bsc IT */
//coffee order
class CoffeeOrder{
    String size;
    double prize;
//constructor
    CoffeeOrder(String size, double prize){
        this.size = size;
        this.prize = prize;
    }
    void displayOrder(){
        System.out.println("Coffee Size: " + size);
        System.out.println("Coffee Prize: " + prize);
    }
    public static void main(String[] args){
        CoffeeOrder order1 = new CoffeeOrder("Large", 100.0);
        order1.displayOrder();
        CoffeeOrder order2 = new CoffeeOrder("Small", 50.0);
        order2.displayOrder();
    }
}
