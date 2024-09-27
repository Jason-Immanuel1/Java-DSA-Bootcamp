import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        currencyConverter convert = new currencyConverter();
        System.out.println("Enter the rupee amount: ");
        Scanner scanner = new Scanner(System.in);
        int rupees = scanner.nextInt();
        double usd = convert.rupeesToDollar(rupees);
        System.out.println("USD: " + usd);
    }
}