public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 54748;
        int res = 0;
        int original = n;
        int temp = n;
        int count = 0;

        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        while (n > 0) {
            int digit = n % 10;
            res = res + (int) Math.pow(digit, count);
            n /= 10;
        }

        if (original == res) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not a Armstrong Number");
        }
    }
}
