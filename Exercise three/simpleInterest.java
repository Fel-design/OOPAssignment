//Main class
public class simpleInterest{
    //method for computing interest   
    public double getInterest(double principal,double rate, int time){
        double interest=principal*rate*time;
        return interest;
    }

    //Main method
    public static void main(String [] args){
        simpleInterest myObj=new simpleInterest(); //Create an object that allows us to view result from getInterest
        double interest=myObj.getInterest(10000,0.005,2); //assigning the object to the variable interest
        System.out.println(interest);
    }
}