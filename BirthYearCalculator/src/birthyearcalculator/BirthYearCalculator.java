package birthyearcalculator;

import java.util.Scanner;

/**
 *
 * @author cstuser
 */
public class BirthYearCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input birthyear: ");
        String birthYear = input.nextLine();
        
        String Cent = birthYear.substring(0, 2);
        String dec = birthYear.substring(2, 3);
        
        int cent2 = Integer.parseInt(Cent);
        
        System.out.printf("%-15s: %s\n", "Century", cent2 + 1);
        System.out.printf("%-15s: %s\n", "Decade", dec + 0);   
    }
    
}
