
public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        int c = 5;

        int first = a + b;
        int second = c - a;
        int third = a + b + c;
        a = first;
        b = second;
        c = third;
        System.out.println("A: " + a + "\n" + "B: " + b + "\n" + "C: " + c + "\n");
    }
}
