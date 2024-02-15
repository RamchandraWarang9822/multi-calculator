import java.util.Scanner;

public class Calculator {
    static int num1, num2;
    static Scanner scanner = new Scanner(System.in); // Declaring scanner as a static variable

    public static void main(String[] args) {
        int choice;

        System.out.println("Calculator");
        System.out.println("==========");
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit");
        choice = scanner.nextInt();

        while (choice != 5) {
            setInput();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + sub(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + mul(num1, num2));
                    break;
                case 4:
                    System.out.println("Result: " + div(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit");
            choice = scanner.nextInt();
        }

        scanner.close(); // Closing scanner when done using it
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Error! Cannot divide by zero");
            return -1;
        }
        return a / b;
    }

    static void setInput() {
        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();
    }
}
