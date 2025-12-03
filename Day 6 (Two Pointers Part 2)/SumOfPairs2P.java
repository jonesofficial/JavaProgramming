public class SumOfPairs2P {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9};
        int l = 0;
        int r = arr.length - 1;
        int target = 7;

        while (l < r) {
            int sum = arr[l] + arr[r];

            if (sum == target) {
                System.out.println("Match Found");
                System.out.println(arr[l] + " " + arr[r]);
                break;
            } else if (sum < target) {
                l++;
            } else if (sum > target) {
                r--;
            }

        }
        
    }
}
