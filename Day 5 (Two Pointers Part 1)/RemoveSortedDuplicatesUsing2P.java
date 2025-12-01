public class RemoveSortedDuplicatesUsing2P {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3, 4, 4, 5, 6, 6, 6};
        int slow = 0;

        for (int fast = 0; fast < arr.length; fast++) {
            if (fast != arr.length - 1 && arr[fast] != arr[fast + 1]) {
                arr[slow] = arr[fast];
                slow++;
            }
            if (fast == arr.length - 1) {
                arr[slow] = arr[fast];
            }
        }

        for (int i = 0; i <= slow; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
