public class CheckSortedorNot {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,78,8};
        boolean isSorted = true;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Sorted");
        }else{
            System.out.println("Not sorted");
        }
    }
}
