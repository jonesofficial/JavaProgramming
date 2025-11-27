public class ReverseANumber {
    public static void main(String[] args) {
        int num = 12345;
        int res = 0;
        int temp = num;

        if (num < 0) {
            num = num * -1;
        }

        while (num > 0) {
            int digit = num % 10;
            res = res * 10 + digit;
            num = num / 10;
        }

        if (temp < 0) {
            res = res * -1;
        }

        System.out.println(res);
    }
}
