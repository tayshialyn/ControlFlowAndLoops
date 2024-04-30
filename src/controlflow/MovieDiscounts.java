package controlflow;

import java.util.Scanner;

public class MovieDiscounts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        if (age < 5) {
            System.out.println("Please pay 2.80 Euros");
        } else if (age > 5 && age <= 60) {
            System.out.println("Please pay 7 Euros");
        } else (age > 60) {
            System.out.println("Please pay 3.15 Euros");
        }
    }
}
