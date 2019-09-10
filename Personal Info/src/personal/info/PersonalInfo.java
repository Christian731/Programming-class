package personal.info;

import java.util.Scanner;
import javax.script.ScriptEngine;

/**
 * Input of the user's personal info and print it
 * @author Christian Paul David
 */
public class PersonalInfo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // To get the personal information from the user
        // Name
        Scanner console = new Scanner(System.in);
        System.out.print("Enter Name:");
        String fname = console.next();
        String lname = console.next();
        
        // Age
        System.out.print("Enter Age:");
        int age = console.nextInt();
        
        // Gender
        System.out.print("Enter Gender:");
        String gender = console.next();
        
        // Department
        System.out.print("Enter Department:");
        String D = console.next();
        String D2 = console.next();
        
        // PI
        System.out.print("Please Enter the value of PI: ");
        double pi = console.nextDouble();
        
        // Printing
        System.out.printf("%-15s:%s %s\n", "Name:", fname, lname);
        System.out.printf("%-15s:%s\n","Age:", age);
        System.out.printf("%-15s:%s\n", "Gender:", gender);
        System.out.printf("%-15s:%s %s\n", "Department:", D, D2);
        System.out.printf("%-15s:%.2f\n", "PI" , pi);
    }
    
}
