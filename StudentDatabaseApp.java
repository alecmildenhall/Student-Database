import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        // Ask how many new students we want to add
        Scanner in = new Scanner(System.in);
        System.out.print("How many students do you want to add? ");
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of new students
        for(int i=0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        // List new students
        for(int i=0; i<numOfStudents; i++) {
            System.out.println(students[i]);
        }
    }
}

