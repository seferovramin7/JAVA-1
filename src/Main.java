//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Welcome message with nice formatting
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║          🧮 SIMPLE CALCULATOR 🧮      ║");
        System.out.println("║         Welcome to Math Fun!        ║");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.println();

        // Get first number from user
        System.out.print("Enter your first number: ");
        double firstNumber = scanner.nextDouble();

        // Get second number from user
        System.out.print("Enter your second number: ");
        double secondNumber = scanner.nextDouble();

        // Show menu of operations
        System.out.println("\n┌─────────────────────────────────────┐");
        System.out.println("│        Choose an operation:         │");
        System.out.println("│  1. ➕ Addition (+)                 │");
        System.out.println("│  2. ➖ Subtraction (-)              │");
        System.out.println("│  3. ✖️  Multiplication (*)           │");
        System.out.println("│  4. ➗ Division (/)                 │");
        System.out.println("└─────────────────────────────────────┘");
        System.out.print("Enter your choice (1-4): ");

        int choice = scanner.nextInt();
        double result = 0;
        String operation = "";

        // TODO: Students need to complete these operations!
        if (choice == 1) {
            // TASK 1: Complete the addition operation
            // result = firstNumber ??? secondNumber;
            operation = "+";
        } else if (choice == 2) {
            // TASK 2: Complete the subtraction operation  
            // result = firstNumber ??? secondNumber;
            operation = "-";
        } else if (choice == 3) {
            // TASK 3: Complete the multiplication operation
            // result = firstNumber ??? secondNumber;
            operation = "*";
        } else if (choice == 4) {
            // TASK 4: Complete the division operation
            // result = firstNumber ??? secondNumber;
            operation = "/";
        } else {
            System.out.println("❌ Invalid choice! Please run the program again.");
            return;
        }

        // Display the beautiful result
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║              📊 RESULT 📊             ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.printf("║  %.1f %s %.1f = %.2f%n", firstNumber, operation, secondNumber, result);
        System.out.println("╚══════════════════════════════════════╝");
        System.out.println("\n🎉 Thank you for using Simple Calculator! 🎉");

        scanner.close();
    }
}