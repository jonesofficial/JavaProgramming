public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2,19,18,87,1,8,5};
        int max = 0;
        int s_max = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                s_max = max;
                max=arr[i];
            } else if (arr[i] > s_max && arr[i] != max) {
                s_max = arr[i];
            }
        }
        System.out.println("Largest: "+ max);
        System.out.println("Second Largest: " + s_max);
    }
}
