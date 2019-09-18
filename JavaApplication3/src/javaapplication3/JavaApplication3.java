package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author cstuser
 */
public class JavaApplication3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String fName = console.next();
        String lName = console.next();
        
        System.out.print("Please enter your Age: ");
        int age = console.nextInt();
        
        System.out.print("Please enter your Gender: ");
        String gender = console.next();
        console.nextLine();
        
        System.out.print("Please enter your Department: ");
        String department = console.nextLine();
        
        System.out.print("Please enter PI (3.141592): ");
        String pi = console.next();
        
        System.out.println("");
        System.out.printf("%-50s: %s %s\n", "Name", fName, lName);
        System.out.printf("%-50s: %d \n", "Age", age);
        System.out.printf("%-50s: %s \n", "Gender", gender);
        System.out.printf("%-50s: %s \n", "Department", department);
        System.out.printf("%-50s: %s \n", "PI", pi);
    }
    
}
