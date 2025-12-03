import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        int r = arr.length - 1;
        int starter = 0;

        for (int l = 0; l < arr.length; l++) {
            if (arr[l] != 0) {
                arr[starter] = arr[l];
                starter++;
            }
        }

        for (int i = starter; i < arr.length; i++) {
            arr[i] = 0;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
