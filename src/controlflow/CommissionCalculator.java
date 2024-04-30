package controlflow;

import java.util.Scanner;

public class CommissionCalculator {
    public static void main(String[] args) {

        int salesFigure = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sales figure: ");

        salesFigure = scanner.nextInt();

        if (salesFigure <= 1000) {
            System.out.println("Commission: N/A");
        } else if (salesFigure > 1000 && salesFigure <= 5000) {
            System.out.println("Commission = 10%");
        } else if (salesFigure > 5000 && salesFigure <= 10000) {
            System.out.println("Commission: 20%");
        } else if (salesFigure > 10000) {
            System.out.println("Commission 30%");
        }
    }
}
