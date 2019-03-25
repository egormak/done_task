import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first value: ");
        int first = in.nextInt();
        System.out.println("Enter second value: ");
        int second = in.nextInt();
        int sum = (first + second);
        int multip = (first * second);
        System.out.println("Sum: " + sum);
        System.out.println("Multiplication: " + multip);

    }
}
