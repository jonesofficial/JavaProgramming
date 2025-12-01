import java.util.Arrays;

public class MinAndMaxUsing2P {
    public static void main(String[] args) {
        int arr[] = {2, 5, 9, 3, 10, 1, 4};
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);
    }
}
