import java.util.Arrays;

public class ReverseArrayUsing2P {
    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 4, 9};
        int l = 0;
        int r = arr.length - 1;
        int temp = 0;

        while (l < r) {
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        System.out.println(Arrays.toString(arr));

    }
}
