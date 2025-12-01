public class NumberPalindrome {
    public static void main(String[] args) {
        int n = 121;
        int pal = 0;
        int original = n;

        while (n > 0) {
            int digit = n % 10;
            pal = pal * 10 + digit;
            n = n / 10;
        }


        if (original == pal) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
