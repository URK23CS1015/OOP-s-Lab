package LabPackage;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private String registerNo;
    private String department;
    private String specialization;
    private double cgpa;
    private String hostelName;
    private String mentorName;
    private int noOfArrears;

    public Student(String name, String registerNo, String department, String specialization, double cgpa, String hostelName, String mentorName, int noOfArrears) {
        this.name = name;
        this.registerNo = registerNo;
        this.department = department;
        this.specialization = specialization;
        this.cgpa = cgpa;
        this.hostelName = hostelName;
        this.mentorName = mentorName;
        this.noOfArrears = noOfArrears;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getRegisterNo() { return registerNo; }
    public void setRegisterNo(String registerNo) { this.registerNo = registerNo; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
    public double getCgpa() { return cgpa; }
    public void setCgpa(double cgpa) { this.cgpa = cgpa; }
    public String getHostelName() { return hostelName; }
    public void setHostelName(String hostelName) { this.hostelName = hostelName; }
    public String getMentorName() { return mentorName; }
    public void setMentorName(String mentorName) { this.mentorName = mentorName; }
    public int getNoOfArrears() { return noOfArrears; }
    public void setNoOfArrears(int noOfArrears) { this.noOfArrears = noOfArrears; }

    @Override
    public String toString() {
        return "Name: " + name + ", Register No: " + registerNo + ", Department: " + department + ", Specialization: " + specialization + ", CGPA: " + cgpa + ", Hostel Name: " + hostelName + ", Mentor Name: " + mentorName + ", No of Arrears: " + noOfArrears;
    }
}

public class ex4q6 {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    editStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    displayStudents();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter register number: ");
        String registerNo = scanner.nextLine();
        System.out.print("Enter department: ");
        String department = scanner.nextLine();
        System.out.print("Enter specialization: ");
        String specialization = scanner.nextLine();
        System.out.print("Enter CGPA: ");
        double cgpa = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter hostel name: ");
        String hostelName = scanner.nextLine();
        System.out.print("Enter mentor name: ");
        String mentorName = scanner.nextLine();
        System.out.print("Enter number of arrears: ");
        int noOfArrears = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student student = new Student(name, registerNo, department, specialization, cgpa, hostelName, mentorName, noOfArrears);
        students.add(student);
        System.out.println("Student added successfully.");
    }

    private static void editStudent() {
        System.out.print("Enter register number of the student to edit: ");
        String registerNo = scanner.nextLine();
        for (Student student : students) {
            if (student.getRegisterNo().equals(registerNo)) {
                System.out.print("Enter new name: ");
                student.setName(scanner.nextLine());
                System.out.print("Enter new department: ");
                student.setDepartment(scanner.nextLine());
                System.out.print("Enter new specialization: ");
                student.setSpecialization(scanner.nextLine());
                System.out.print("Enter new CGPA: ");
                student.setCgpa(scanner.nextDouble());
                scanner.nextLine(); // Consume newline
                System.out.print("Enter new hostel name: ");
                student.setHostelName(scanner.nextLine());
                System.out.print("Enter new mentor name: ");
                student.setMentorName(scanner.nextLine());
                System.out.print("Enter new number of arrears: ");
                student.setNoOfArrears(scanner.nextInt());
                scanner.nextLine(); // Consume newline
                System.out.println("Student details updated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void deleteStudent() {
        System.out.print("Enter register number of the student to delete: ");
        String registerNo = scanner.nextLine();
        for (Student student : students) {
            if (student.getRegisterNo().equals(registerNo)) {
                students.remove(student);
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
