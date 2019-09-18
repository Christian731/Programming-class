package birthyearcalculator;

import java.util.Scanner;

/**
 * To convert input birth year to century and decade
 *
 * @author Christian
 */
public class BirthYearCalculator {

    public static void main(String[] args) {
        // To get input
        Scanner input = new Scanner(System.in);
        System.out.print("Please input birthyear: ");
        String birthYear = input.nextLine();

        // Declaring variables
        String Cent = birthYear.substring(0, 2);
        String dec = birthYear.substring(2, 3);

        // To change string to integer
        int cent2 = Integer.parseInt(Cent);

        // Printing
        System.out.printf("%-15s: %s\n", "Century", cent2 + 1);
        System.out.printf("%-15s: %s\n", "Decade", dec + 0);
    }

}
