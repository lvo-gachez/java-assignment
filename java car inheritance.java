
//code of parent car class and child car class inheriting from vehicle
class Vehicle {
    String brand;
    int year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
   
  
    }
class Car extends Vehicle {
    int seats;
    Car(String brand, int year, int seats) {
        super(brand, year);
        this.seats = seats;
    } 
    
   void displayDetails(){
      System.out.println("Brand: "+ brand);
        System.out.println("Year: "+ year);
        System.out.println("Seats: "+ seats);
   }
}
   public class Main{
        public static void main(String[]args) {
            Car myCar = new Car("Honda", 2023, 7);
            myCar.displayDetails();    
    }
}