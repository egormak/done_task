
public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;

        System.out.println("A: " + a + "\n" + "B: " + b + "\n");
    }
}
