public class SumOfDigits {
    public static void main(String[] args) {
        int n = 3578;
        int res = 0;

        while (n > 0) {
            int digit = n % 10;
            res = res + digit;
            n /= 10;
        }

        System.out.println(res);
    }
}
