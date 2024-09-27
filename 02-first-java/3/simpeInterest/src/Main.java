import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        simpleInterest calc = new simpleInterest();
        System.out.println("Enter the input principle: ");
        Scanner ip = new Scanner(System.in);
        float inputPrinciple = ip.nextFloat();
        System.out.println("Enter the time in years: ");
        Scanner t = new Scanner(System.in);
        int years = t.nextInt();
        System.out.println("Enter the interest rate: ");
        Scanner r = new Scanner(System.in);
        float interestRate = r.nextFloat();
        float output = calc.Calculation(years, inputPrinciple, interestRate);
        System.out.println("The simple interest total is " + output + " after " + years + " years.");
    }
}