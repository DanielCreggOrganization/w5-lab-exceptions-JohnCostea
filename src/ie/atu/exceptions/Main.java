package ie.atu.exceptions;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // DIY 1
        // String text = null;
        // if(text != null){
        //     System.out.println("Text length: " + text.length());
        // } else {
        //     System.out.println("Text is null. cannot retreieve length");
        // }

        //DIY 2
        //     int numerator = 10;
        //     int denumerator = 0;
        // try {
        //     // This will throw a NullPointerException because 'text' is null.
        //     int result = numerator / denumerator;
        //     System.out.println("Result: " + result);
        // } catch (ArithmeticException e) {
        //     System.out.println("Caught ArithmeticException: " + e.getMessage());
        // }

        //DIY 3
        // System.out.println("Simulating file processing");
        // try {
        //     System.out.println("Opening file..");
        //     throw new Exception("Error reading file");
        // } catch (Exception e) {
        //     System.out.println("Caught exception" + e.getMessage());
        // } finally {
        //     System.out.println("File processing completed.");
        // }

        //DIY 4
        // System.out.println("Enter a number to calculate its square: ");
        // try (Scanner scanner = new Scanner(System.in)) {
        //     int number = scanner.nextInt();
        //     System.out.println("Square: " + number * number);
        // } catch(Exception e){
        //     System.out.println("Error reading number: " + e.getMessage());
        // }

        //DIY 5
        // //Demonstrate checked exception
        // try {
        //     FileReader reader = new FileReader("nonexistent.txt");
        // } catch (IOException e) {
        //     System.out.println("Caught checked exception: " + e.getMessage());
        // }
        // // Unchecked Exception Example:
        // int [] emptyArray = new int[0];
        // System.out.println(emptyArray[0]);

        //DIY 6
        // try {
        //     calculateGrade(50); // This will throw an exception.
        // } catch (IllegalArgumentException e) {
        //     System.out.println("Caught exception: " + e.getMessage());
        // }

        //DIY 7
        // System.out.println("Testing bank account: ");
        // BankAccount account = new BankAccount(100);
        // try {
        //     account.withdraw(50);
        //     account.withdraw(100);
        // } catch (InsufficientFundsException e) {
        //     System.out.println("Caught exception: " + e.getMessage());
        // }

        //DIY 8
        

        
    }
    // public static void calculateGrade(int grade) {
    //     if (grade > 100 || grade < 0) {
    //         throw new IllegalArgumentException("Grade must be between 0 and 100.");
    //     }
    //     System.out.println("Grade is valid.");
    // }
}
