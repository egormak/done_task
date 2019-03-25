import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter candy count(kg): ");
        int candy_count = in.nextInt();
        System.out.println("Enter candy price: ");
        int candy_price = in.nextInt();

        System.out.println("Enter how much do you need: ");
        int candy_count_user = in.nextInt();
        int candy_price_user = (candy_price * candy_count_user) / candy_count;
        System.out.println("It will be cost: " + candy_price_user);

        System.out.println("How much do you have? ");
        int money_user = in.nextInt();
        int candy_user = (candy_count * money_user) / candy_price;
        System.out.println("You can buy: " + candy_user);
    }
}
