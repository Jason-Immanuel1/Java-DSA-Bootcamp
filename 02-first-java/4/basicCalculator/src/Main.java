import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float firstNumber = scanner.nextFloat();
        System.out.print("Enter the second number: ");
        float secondNumber = scanner.nextFloat();
        System.out.print("Enter the operator: ");
        String operator = scanner.next();
        float result = calculator.calculate(firstNumber, secondNumber, operator);
        System.out.println("The result is: " + result);
    }
}