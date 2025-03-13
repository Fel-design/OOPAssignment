import java.util.Scanner;

   class getDiscount{

    
    public double calcDiscount(double amount){
        double discount=0.0;
                if(amount>5000){
            discount=amount*0.1;
        }
        else if(amount>=1000 && amount<=5000){
            discount=amount*0.05;
        }
        else{
            discount=0.0;
        }

        return discount;
    }
}
    
    public class calculateDiscount{
    
    public static void main(String[]args){
        double amt;
        Scanner myObj=new Scanner(System.in); //scanner object
        
        System.out.println("Enter Amount:");
        amt=myObj.nextDouble();

        //Object that gets the value for discount gotten by the if else statement
        getDiscount dis= new getDiscount();
        double disc=dis.calcDiscount(amt);

        System.out.println(disc); //prints out the value
    }
    }