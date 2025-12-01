public class CountNoOfTargetOfaNumber {
    public static void main(String[] args) {
        int n = 5677877;
        int target = 7;
        int count = 0;


        while (n > 0) {
            int digit = n % 10;
            if (digit == target) {
                count++;
            }
            n = n / 10;

        }


        System.out.println(count);

    }
}
