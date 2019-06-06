public class Main {
    public static void main(String[] args) {
        int first_line = 647;
        int second_line = 170;
        int line_kub = 30;

        int first_size = first_line / line_kub;
        System.out.println("In Line you can place: " + first_size);

        int second_size = second_line / line_kub;
        System.out.println("In Column you can place: " + second_size);

        int all = first_size * second_size;
        System.out.println("All Count: " + all);
    }
}