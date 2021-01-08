import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private static int courseCost = 600;
    private int tuitionBalance;
    private static int id = 1000;


    // Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Please enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\n" +
                "Please enter student grade year: ");
        this.gradeYear = in.nextInt();

        setStudentID();

    }

    // Generate an ID
    private void setStudentID() {
        // Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll() {
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Please enter course to enroll (Q to quit): ");
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + courseCost;
            } else {
                break;
            }
        } while (1 != 0);
    }

    // View balance
    public void viewBalance() {
        System.out.println("Your balance: $" + tuitionBalance);
    }

    // Pay tuition
    public void payTuition() {
        viewBalance();
        Scanner in = new Scanner(System.in);
        System.out.print("How much do you want to pay? $");
        int payment = in.nextInt();
        System.out.println("Thank you for your payment of $" + payment);
        tuitionBalance = tuitionBalance - payment;
        viewBalance();
    }

    // Show status
    public String toString() { // choose what i want i
        return "Name: " + firstName + " " + lastName +
                "\nGrade level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
