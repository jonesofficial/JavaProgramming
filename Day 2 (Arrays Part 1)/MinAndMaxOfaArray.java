public class MinAndMaxOfaArray {
    public static void main(String[] args) {
        int[] arr = {1,9,12,8,4,19,2,6};
        int max=arr[0];
        int min=Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }

            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Smallest Element of the Array: " + min);
        System.out.println("Largest Element of the Array: " + max);
    }
}
