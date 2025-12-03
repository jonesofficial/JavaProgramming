public class LongestSubstringUsing2P {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 2, 3};
        int l = 0;
        int r = 1;
        int lensum = 0;

        while (l < arr.length) {
            if (arr[l] != arr[r]) {
                r++;
            }
        }
    }
}
