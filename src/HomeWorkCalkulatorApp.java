import java.util.Scanner;

public class HomeWorkCalkulatorApp {

    public static void main(String[] args) {
        calcOn();
    }

    public static void calcOn () {
        double firstNumber = getNumber();
        String operation = getOperation();
        double secondNumber = getNumber();
        double result = calc(firstNumber, secondNumber, operation);
        System.out.println("Result: " + result);
    }

    public static double calc(double num1, double num2, String operation) {
        return switch (operation) {
            case "+" -> add(num1, num2);
            case "-" -> sub(num1, num2);
            case "*" -> mul(num1, num2);
            case "/" -> div(num1, num2);
            default -> Double.NaN;
        };
    }

    public static double getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            System.out.println("Incorrect! Try again...");
            return getNumber();
        }
    }

    public static String getOperation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Select operation number:
                + - add
                - - subtract
                * - multiply
                / - divide
                """);
        String operation = sc.nextLine();
        if (sc.nextLine() == "+" || sc.nextLine() == "-" || sc.nextLine() == "*" || sc.nextLine() == "/") {
            return operation;
        } else {
            System.out.println("Incorrect option! Try again...");
            return getOperation();
        }
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double sub(double num1, double num2) {
        return num1 - num2;
    }

    public static double mul(double num1, double num2) {
        return num1 * num2;
    }

    public static double div(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("You can't divide by zero!");
            return Double.NaN;
        }
    }
}
