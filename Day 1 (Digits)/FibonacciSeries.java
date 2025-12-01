public class FibonacciSeries {
    public static void main(String[] args) {
        int range = 10;
        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 0; i < range; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
