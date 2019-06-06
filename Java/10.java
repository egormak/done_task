
public class Main {
    public static void main(String[] args) {
        int result = 237;
        // Third Quest
        int third_number = result / 100;
        int third_result = result - third_number * 100;

        // Second Quest
        int second_result = third_result * 10;

        // First Quest
        int first_result = second_result + third_number;
        System.out.println("This Number: " + first_result);
    }
}