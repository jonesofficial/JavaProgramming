import java.util.ArrayList;

public class RemoveZeros {
    public static void main(String[] args) {
        int n = 309580;
        int res = 0;
        ArrayList<Integer> lst = new ArrayList<>();

        while (n > 0) {
            int digit = n % 10;
            if (digit != 0) {
                lst.add(digit);
            }
            n /= 10;
        }

        for (int i = lst.size() - 1; i >= 0; i--) {
            System.out.print(lst.get(i) + " ");
        }
    }
}
