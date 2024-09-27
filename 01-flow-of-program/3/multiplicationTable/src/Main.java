import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner num =  new Scanner(System.in);
        int number = num.nextInt();
        for (int i = 1; i < 13; i++){
            System.out.println(i + " X " + number + " = " + number * i);
        }
    }
}