public class SumOfAllEvenAndOddDigits {
    public static void main(String[] args) {
        int n = 132546;
        int odd = 0;
        int even = 0;
        int ori = n;

        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                even += digit;
            } else {
                odd += digit;
            }
            n = n / 10;
        }
        System.out.println("Given number:" + ori);
        System.out.println("Sum of Odds: " + odd);
        System.out.println("Sum of Evens: " + even);
    }
}
