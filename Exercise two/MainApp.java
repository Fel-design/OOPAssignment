
import java.util.Scanner;

class Employee {

    String name;
    double salary;
    double bonus;

    //Constructor
    public Employee(String name, double salary,double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus=bonus;
    }

    //method to display employees details
    public void displayDetails() {
        System.out.println("Name:" + name);
        System.out.println("Salary:" + salary);
        System.out.println("Bonus:" + bonus);
    }

}

//salarycalculator class
    class SalaryCalculator{

        //Method to calculate bonus
        public double calculateBonus(double salary) {
            return 0.1 * salary;
        }

    }

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner object
        
        //user input
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();

        SalaryCalculator myObj = new SalaryCalculator(); //Object to calculate bonus
        double bonus = myObj.calculateBonus(salary);

        Employee employee = new Employee(name, salary, bonus); 
        employee.displayDetails();
    }
}
