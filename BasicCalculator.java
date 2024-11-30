import java.util.Scanner;
public class Basiccalculator {

    public static void main(String[] args) {
        String username = "jonathan";
        String password = "12345";

        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;
        int attempts = 0;
        final int MAX_ATTEMPTS = 3;

        // Initial login attempt
        System.out.println("Enter your name: ");
        String enteredUsername = scanner.nextLine();
        System.out.println("Enter password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            loggedIn = true;
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid username or password.");
            attempts++;
        }

        // Additional login attempts if the first attempt failed
        while (!loggedIn && attempts < MAX_ATTEMPTS) {
            System.out.println("Enter your name: ");
            enteredUsername = scanner.nextLine();
            System.out.println("Enter password: ");
            enteredPassword = scanner.nextLine();

            if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
                loggedIn = true;
                System.out.println("Login successful.");
            } else {
                attempts++;
                System.out.println("Invalid username or password.");
                if (attempts >= MAX_ATTEMPTS) {
                    System.out.println("All attempts failed.");
                    break;
                }
            }
        }

        // Calculator loop if logged in
        if (loggedIn) {
            boolean continueCalculating = true;
            while (continueCalculating) {
                System.out.println("Simple Calculator");
                System.out.println("CHOOSE AN OPERATION");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exit");

                System.out.print("Enter choice (1-5): ");
                int choice = scanner.nextInt();

                if (choice == 5) {
                    continueCalculating = false;
                    System.out.println("Exiting the calculator");
                    continue;
                }

                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                double result;
                switch (choice) {
                    case 1: // Addition
                        result = num1 + num2;
                        System.out.println("Result: " + result);
                        break;
                    case 2: // Subtraction
                        result = num1 - num2;
                        System.out.println("Result: " + result);
                        break;
                    case 3: // Multiplication
                        result = num1 * num2;
                        System.out.println("Result: " + result);
                        break;
                    case 4: // Division
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result: " + result);
                        } else {
                            System.out.println("Error: Division by zero.");
                        }
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                        break;
                }
            }
        }

        // Close the scanner
        scanner.close();
    }
}