public class MergeTwoSortedArrays2P {
    public static void main(String[] args) {
        int arr1[] = {1, 4, 5};
        int arr2[] = {2, 3, 6};
        int size = arr1.length + arr2.length;
        int[] res = new int[size];

        int l1 = 0;
        int l2 = 0;
        int r = 0;

        for (l1 = 0; l1 < size; l1++) {
            if (arr1[l1] < arr2[l2]) {
                res[r] = arr1[l1];
                r++;
                res[r] = arr2[l2];
            } else {
                res[r] = arr2[l2];
                r++;
                res[r] = arr1[l1];

            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
