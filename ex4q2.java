package LabPackage;

import java.util.Scanner;

class Tollbooth {
    private int totalCars;
    private double totalCash;

    public Tollbooth() {
        totalCars = 0;
        totalCash = 0.0;
    }

    public void payingCar() {
        totalCars++;
        totalCash += 50.0;
    }

    public void noPayCar() {
        totalCars++;
    }

    public void display() {
        System.out.println("Total cars: " + totalCars);
        System.out.println("Total cash: " + totalCash);
    }
}

public class ex4q2 {
    public static void main(String[] args) {
        Tollbooth booth = new Tollbooth();
        Scanner scanner = new Scanner(System.in);
        char choice;

        System.out.println("Press 'p' for paying car, 'n' for non-paying car, 'e' to exit and display totals.");

        while (true) {
            choice = scanner.next().charAt(0);
            if (choice == 'p') {
                booth.payingCar();
            } else if (choice == 'n') {
                booth.noPayCar();
            } else if (choice == 'e') {
                booth.display();
                break;
            }
        }
        scanner.close();
    }
}
