import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        Scanner num1 = new Scanner(System.in);
        int numberOne = num1.nextInt();
        System.out.println("Enter the second number: ");
        Scanner num2 = new Scanner(System.in);
        int numberTwo = num2.nextInt();
        int largest = Math.max(numberOne, numberTwo);
        int smallest = Math.min(numberOne, numberTwo);

        while (smallest != 0){
            int remainder = largest % smallest;
            largest = smallest;
            smallest = remainder;

        }
        System.out.println(largest + " is the HCF");

        System.out.println(((numberOne * numberTwo) / largest + " is the LCM"));
    }
}