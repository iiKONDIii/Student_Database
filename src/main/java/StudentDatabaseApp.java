import java.util.Random;
import java.util.Scanner;

public class StudentDatabaseApp {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many students are enrolling");
        int numOfStudents = input.nextInt();
        Student[] students = new Student[numOfStudents];
        for (int n = 0; n < numOfStudents; n++ ){
            Student student = new Student();
            student.setCourse();
            student.makePayments();
            String strvalue = Integer.toString(numOfStudents);
            System.out.println(strvalue+" : Student(s) have/has enrolled");
        }
/*
        for (int n = 0; n <numOfStudents; n++){

            System.out.println(students[n].toString());

        }*/

    }
}

