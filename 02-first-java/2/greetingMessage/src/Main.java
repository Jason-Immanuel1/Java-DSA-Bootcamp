import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        greetingMessage firstMessage = new greetingMessage();
        System.out.print("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String output = firstMessage.greeting(name);
        System.out.println(output);
    }
}