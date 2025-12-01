import java.util.Arrays;

public class CountOccurancesUsing2P {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 2, 2, 8, 2, 7, 2, 20};
        int slow = 0;
        int target = 2;

        for (int fast = 0; fast < arr.length; fast++) {
            if (arr[fast] != target) {
                arr[slow] = arr[fast];
                slow++;
            }
        }
        System.out.println("No of occurances: " + slow);

        for (int i = 0; i < slow; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
