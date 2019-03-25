import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter weeks: ");
        int week_count = in.nextInt();
        System.out.println("Enter month: ");
        int month_count = in.nextInt();
        System.out.println("Enter years: ");
        int years_count = in.nextInt();

        int days = ( 7 * week_count ) + ( 30 * month_count ) + ( 365 * years_count );
        System.out.println("Days: " + days);
    }
}
