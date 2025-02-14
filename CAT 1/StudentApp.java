 import java.util.Scanner;

class StudentRecord{
    int studentID;
    String name;
    String course;

//CREATING A CONSTRUCTOR
     public StudentRecord(int studentID, String name, String course){
         this.studentID=studentID;
        this.name=name;
        this.course=course;

    }

    //creating a method
    public void displayDetails(){
System.out.println();
        System.out.println("Student details:");
        System.out.println("Student ID:"+ studentID);
        System.out.println("Name:"+ name);
        System.out.println("Course:"+ course);


    
    }
}

public class StudentApp{
        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
           
            System.out.print("Enter your name:");
            String name= scanner.nextLine();
            System.out.print("Enter your Course:");
            String course= scanner.nextLine();
            System.out.print("Enter your Student ID:");
            int id= scanner.nextInt();


            StudentRecord myObj= new StudentRecord(id, name, course);
            myObj.displayDetails();

           scanner.close();
    }
}