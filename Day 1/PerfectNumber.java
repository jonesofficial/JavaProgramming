import java.util.ArrayList;

public class PerfectNumber {
    public static void main(String[] args) {
        int n = 8128;
        int res = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                res = res + i;
            }
        }
        if (res == n) {
            System.out.println("A Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }

    }
}
