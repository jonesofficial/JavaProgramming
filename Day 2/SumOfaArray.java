public class SumOfaArray {
    public static void main(String[] args) {
        int[] arr = {5,10,4,9,2};
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            res = res + arr[i];
        }

        System.out.println("The sum of the array is: "+ res);

    }
}
