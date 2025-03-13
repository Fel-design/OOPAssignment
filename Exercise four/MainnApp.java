//Bankaccount system to demonstrate encapsulation
import java.util.Scanner;

//bank account class where account balance is private
class BankAccount{
    private double balance;

//get method for balance
    public double getBalance(){
        return balance;
    }

//Deposit method
    public void deposit(double amount){
        balance += amount;
        System.out.println("Your balance is "+ balance);
    }
//withdraw method
    public double withdraw(double amount){
        if(amount < balance){
            balance -= amount;
            System.out.println("Your balance is "+ balance);
        }
        else if(amount > balance){
            System.out.println("Insufficient funds!");
        }
                return amount;
    }

}
//main method
public class MainnApp{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        BankAccount money= new BankAccount();//money is the object of bankaccount
        char ans;
                 // The system offers options for user to choose from
                    do{
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. check balance");
                    System.out.println("Enter choice:");
                    int choice= scanner.nextInt();
                
                //The system gives the output based on what option the user choose
                    if(choice == 1){
                        System.out.println("Enter amount to deposit:");
                        int amount= scanner.nextInt();
            
                        money.deposit(amount);
                    }
                    else if(choice == 2){
                        System.out.println("Enter amount to withdraw:");
                        int amount= scanner.nextInt();
                        
                        money.withdraw(amount);
                    }
                    else if(choice == 3){
                        System.out.println("Your balance is "+money.getBalance());
                    }
                    System.out.println("Would you like to perform another service(Y/N)?");
                    ans = scanner.next().charAt(0);
                    }while(ans == 'Y' || ans == 'y');
                  
        scanner.close();
    }
}