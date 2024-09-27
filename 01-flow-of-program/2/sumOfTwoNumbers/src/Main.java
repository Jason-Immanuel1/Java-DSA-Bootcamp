import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the first number:");
        Scanner number1 = new Scanner(System.in);
        float numberOne = number1.nextFloat();
        System.out.print("Enter the second number:");
        Scanner number2 = new Scanner(System.in);
        float numberTwo = number2.nextFloat();
        System.out.println(numberOne + numberTwo);
    }
}