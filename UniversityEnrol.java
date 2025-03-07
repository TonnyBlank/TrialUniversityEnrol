package universityenrol;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UniversityEnrol {
    private String firstname;
    private String lastname;
    private String middlename;
    private int indexnumber;
    private String email;
    private String password;
    private String regNO;
    private String portalpassword;

    
    public UniversityEnrol(String firstname, String lastname, String middlename, String email, int indexnumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.middlename = middlename;
        this.email = email;
        this.indexnumber = indexnumber;
        this.regNO = generateRandomregNO();
        this.password = generaterandomPassword();
    }

    public String generateRandomregNO() {
        Random random = new Random();
        int uniqueNumber = random.nextInt(900); 
        return "COM/B/01-" + uniqueNumber + "/2025";
    }

    private String generaterandomPassword() {
        Random random = new Random();
        char letter = (char) ('A' + random.nextInt(26));
        int number = 1000 + random.nextInt(9000);
        return letter + "" + number;
    }

    public void display() {
        System.out.println("Name: " + firstname + " " + middlename + " " + lastname);
        System.out.println("Email: " + email);
        System.out.println("Index Number: " + indexnumber);
        System.out.println("Default Password for Portal: " + password);
        System.out.println("Reg NO: " + regNO);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<UniversityEnrol> students = new ArrayList<>();

        System.out.print("Enter the number of students to enroll: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Middle Name: ");
            String middleName = scanner.nextLine();
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("KCSE Index Number: ");
            int indexNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Email: ");                              
            String email = scanner.nextLine();

            UniversityEnrol student = new UniversityEnrol(firstName, lastName, middleName, email, indexNumber);
            students.add(student);
            System.out.println("Student enrolled successfully!");
            student.display();
        }
 
            } 
        }
    
 
    