import java.util.Scanner;

public class ArithmeticOpr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first operand: ");
        double operand1 = scanner.nextDouble();

        System.out.print("Enter the second operand: ");
        double operand2 = scanner.nextDouble();

        
        System.out.print("Choose an operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

       
        double result = performOperation(operand1, operand2, operator);

       
        System.out.println("Result: " + result);
    }

    private static double performOperation(double operand1, double operand2, char operator) {
        double result = 0.0;

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }

        return result;
    }
}
