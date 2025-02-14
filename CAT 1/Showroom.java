import java.util.Scanner;
class Vehicle{

String brand;
String model;
int year;

//constructor
public Vehicle(String brand, String model, int year){
    this.brand=brand;
    this.model=model;
    this.year=year;
}
//method
public void displayDetails(){
        System.out.println("Brand:" +brand);
        System.out.println("Model:"+ model);
        System.out.println("Year:"+ year);
    }
}

class Car extends Vehicle{

String fuelType;

public Car(String brand, String model, int year, String fuelType) { 

 super(brand, model, year);

 this.fuelType = fuelType;

}

@Override 

 public void displayDetails() {

 super.displayDetails(); 

 System.out.println("Fuel Type: " + fuelType);

 } 

}

public class Showroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.print("Enter car brand: ");
         String brand = scanner.nextLine();

         System.out.print("Enter car model: ");
         String model = scanner.nextLine();

         System.out.print("Enter fuel type: ");
         String fuelType = scanner.nextLine();

         System.out.print("Enter car year: ");
         int year = scanner.nextInt();

         Car myCar = new Car(brand, model, year, fuelType);

         System.out.println("\nCar Details:");
         myCar.displayDetails();
         scanner.close(); 
    }
        
}
    


 
 

 