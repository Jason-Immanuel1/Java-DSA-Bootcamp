import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        oddOrEven calc = new oddOrEven();
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String answer = calc.Calculation(n);
        System.out.println(answer);
    }
}