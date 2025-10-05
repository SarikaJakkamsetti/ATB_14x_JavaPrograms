package Tasks_assigned_Liveclass;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int student_marks = readInt(scanner, "Enter marks between 1 to 100");


        if (student_marks >= 90 && student_marks <= 100) {
            System.out.println("Student grade is 'A'");
        } else if (student_marks >= 80 && student_marks < 90) {
            System.out.println("Student grade is 'B'");
        } else if (student_marks >= 70 && student_marks < 80) {
            System.out.println("Student grade is 'C'");
        } else if (student_marks >= 60 && student_marks < 70) {
            System.out.println("Student grade is 'D'");
        } else if (student_marks < 60) {
            System.out.println("Student grade is 'F'");
        } else {
            System.out.println("Please enter marks between 1 to 100");
        }


    }

    static int readInt(Scanner scanner, String prompt) {
       System.out.println(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Enter the int only.");
            System.exit(0);
            return 0;
        }


    }
}

