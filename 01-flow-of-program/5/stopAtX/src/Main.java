import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numberArray = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (x to stop):");
        while (scanner.hasNext()) {
            System.out.println("Enter a number (x to stop):");
            if (scanner.hasNextInt()) {
                Integer number = scanner.nextInt();
                numberArray.add(number);
            }
            else{
                String x = scanner.next();
                break;
            }

        }
        int sum = 0;
        for (Integer integer : numberArray) {
            sum += integer;
        }
        System.out.println(sum);
    }
}