import java.util.Scanner;

public class PrimeNumberInRange {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a range to Prime nos btwn them: ");
        System.out.println("From: ");
        int from = obj.nextInt();
        System.out.println("To: ");
        int to = obj.nextInt();
        int count = 0;
        int res = 0;
        System.out.println("The Prime numbers between " + from + " and " + to + " are: ");

        for (int i = from; i < to; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }
        }


    }
}
