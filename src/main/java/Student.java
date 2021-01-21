import java.util.Scanner;
import java.util.Random;

public class Student {

    private String firstName;
    private String lastName;
    private int yearGroup;
    private String stuID;
    private String course ="";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;
    Scanner in = new Scanner(System.in);


    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name");
        this.firstName = in.next();
        System.out.println("Enter student last name");
        this.lastName = in.next();
        System.out.println("1:Foundation 2:Undergraduate 3:Masters 4: PhD");
        this.yearGroup = in.nextInt();
        setID();
        System.out.println(firstName + " " + lastName + " " + yearGroup + " " + " student ID :" + stuID);
    }

    private void setID() {
        id++;
        stuID = yearGroup + "" + id;
    }

    public void setCourse() {

        do {
            System.out.print("Which course would you like to enroll on? press Q to quit: ");
            String courses = in.next().toUpperCase();
            if (!courses.equals("Q")) {
                course = course + "\n" + courses;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }

        } while (1 != 0);
        System.out.println("ENROLLED IN: " + course);
        //System.out.println("TUITION BALANCE:" + tuitionBalance);
    }

    public void viewBalance(){
        System.out.println("Your current balance is: "+ tuitionBalance);
    }

    public void makePayments(){
        viewBalance();
        System.out.println("How much would you like to pay towards your balance?");
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Your balance is now: "+ tuitionBalance);
        if (payment >= tuitionBalance){
            System.out.println("You have paid off all your debts...thank you");
        }
        else{
            System.out.println("Your remaining fee is: "+tuitionBalance);
        }
    }
}

