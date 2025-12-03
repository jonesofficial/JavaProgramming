public class StringPalindromeUsing2P {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String tns = s.toLowerCase();
        int l = 0;
        int count = 0;

        char[] arr = tns.toCharArray();


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 97 && arr[i] <= 122 || arr[i] >= 48 && arr[i] <= 57) {
                arr[l] = arr[i];
                l++;
            }
        }

        int r = l - 1;

        for (int i = 0; i < l; i++) {
            if (i < r && arr[i] != arr[r]) {
                count++;
                break;
            }
            r--;

        }

        for (int i = 0; i < l; i++) {
            System.out.print(arr[i]);
        }

        System.out.println();

        if (count == 0) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
