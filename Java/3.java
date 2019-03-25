import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter candy cost(kg): ");
        int price_candy = in.nextInt();
        System.out.println("Enter cookie price(kg): ");
        int price_cookie = in.nextInt();

        int count_candy_a = 300;
        int count_cookie_a = 400;

        int price_candy_user_a = (price_candy * count_candy_a) / 1000;
        int price_cookie_user_a = (price_cookie * count_cookie_a) / 1000;
        System.out.println("It will be cost_a: " + (price_candy_user_a + price_cookie_user_a));

        int count_candy_b = 1800;
        int count_cookie_b = 2000;

        int price_candy_user_b = (price_candy * count_candy_b) / 1000;
        int price_cookie_user_b = (price_cookie * count_cookie_b) / 1000;
        System.out.println("It will be cost_b: " + (3*(price_candy_user_b + price_cookie_user_b)));

    }
}
