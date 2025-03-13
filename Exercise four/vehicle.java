//car class to demostrate encapsulation
class Car {
      //private attributes
    private String licensePlate;
    private boolean isRented;

  //constructor
    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.isRented = false;

    }
   //method to rent car onlyif it's not rented
    public boolean rentCar() {
        if (!isRented) {
            isRented = true;
            System.out.println("Car" + licensePlate + "has been rented");
            return true;
        } else {
            System.out.println("Car" + licensePlate + "is already rented");
            return false;
        }
    }
    //method that marks the car as avaialble
    public void returnCar() {
        if (isRented) {
            isRented = false;
            System.out.println("Car" + licensePlate + "has been returned");
        } else {
            System.out.println("Car" + licensePlate + "was not rented");
        }
    }
       //getter method to check if car is rented
    public boolean isRented() {
        return isRented;
    }
}
//main method
   public class vehicle{
    public static void main(String[] args) {
        Car myCar = new Car("KDK 238H");

     //try renting the car
        myCar.rentCar();

        //try renting the car again(should fail)
        myCar.rentCar();

        //return the car
        myCar.returnCar();

        //check rental status
        System.out.println("Is the car rented?" + myCar.isRented());
    }
   }


