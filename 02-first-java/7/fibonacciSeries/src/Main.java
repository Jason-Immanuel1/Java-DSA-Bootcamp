import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        for (int i=0; i<=number; i++){
            System.out.println(fib.fibonacciCalculation(i));
        }
    }
}