public class CountEvenOrOddArray {
    public static void main(String[] args) {
        int[] arr = {2,6,8,1,3};
        int odd=0;
        int even=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("No of Odds: "+ odd);
        System.out.println("No of Evens: "+ even);
    }
}
