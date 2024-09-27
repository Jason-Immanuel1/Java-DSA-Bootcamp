import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a year: ");
        Scanner year = new Scanner(System.in);
        int yearNum = year.nextInt();
        boolean leapYear = false;
        if (yearNum % 4 == 0) {
            if (yearNum % 100 == 0) {
                if (yearNum % 400 == 0) {
                    leapYear = true;
                }
            } else {
                leapYear = true;
            }
        }

        if (leapYear) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }
}