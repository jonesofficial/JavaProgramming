import java.util.ArrayList;

public class RemoveDuplicatesUsingArray {
    public static void main(String[] args) {
        int[] arr = {3,1,3,7,1,2};
        ArrayList<Integer> lst = new ArrayList<>();

        for(int i=0; i< arr.length; i++){
            lst.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    lst.remove(arr[i]);
                }
            }
        }

        System.out.println(lst);
    }
}
