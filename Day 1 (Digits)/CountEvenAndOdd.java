import java.util.ArrayList;

public class CountEvenAndOdd {
    public static void main(String[] args) {
        int n = 58390;
        int count = 0;
        int odd = 0;
        int even = 0;


        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            n = n / 10;
            count++;
        }


        System.out.println(count);
        System.out.println("Odd: " + odd);
        System.out.println("Even: " + even);
    }
}
