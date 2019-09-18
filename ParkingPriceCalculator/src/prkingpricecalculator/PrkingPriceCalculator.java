package prkingpricecalculator;

import java.util.Scanner;

/**
 * To calculate the parking price
 *
 * @author Christian
 */
public class PrkingPriceCalculator {

    public static void main(String[] args) {
        // Getting input
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter parking time in minutes: ");

        // Declaring variables
        double parkMin = input.nextInt();
        double parkHour = Math.ceil(parkMin / 60);
        double parkPrice = parkHour * 2;

        // Printing
        System.out.println("");
        System.out.printf("%-15s: %.0f\n", "Parking in minutes", parkMin);
        System.out.printf("%-15s: %.0f\n", "Parking in hours", parkHour);
        System.out.printf("%-15s: $%.2f\n", "Parking Price", parkPrice);
    }
}
