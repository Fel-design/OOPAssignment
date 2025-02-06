
import java.util.Scanner;

class Student {

    String name;
    double marks;
    char grade;

    //constructor
    public Student(String name, double marks, char grade) {
        this.name = name;
        this.marks = marks;
        this.grade = grade;
    }

    public void displayDetails() {
        System.out.println("Name:" + name);
        System.out.println("Marks:" + marks);
        System.out.println("Grade:" + grade);
    }
}

class GradeCalculator {

    public char calculateGrade(double marks) {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75 && marks < 90) {
            return 'B';
        } else if (marks >= 50 && marks < 75) {
            return 'c';
        } else {
            return 'D';
        }
    }
}

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter your marks");
        double marks = scanner.nextDouble();

        GradeCalculator calc = new GradeCalculator();
        char grade = calc.calculateGrade(marks);

        Student myObj = new Student(name, marks, grade);
        myObj.displayDetails();
    }
}
