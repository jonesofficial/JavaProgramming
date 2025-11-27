public class ReverseaArrayUsingSwap {
    public static void main(String[] args) {
        int[] arr = {2,20,8,7,3,10};
        int i = 0;
        int j = arr.length-1;

        while(i<j){
            arr[i] = arr[i]+arr[j];
            arr[j] = arr[i]-arr[j];
            arr[i] = arr[i]-arr[j];

            i++;
            j--;
        }
        for(int k : arr){
            System.out.print(k+",");
        }
    }
}
