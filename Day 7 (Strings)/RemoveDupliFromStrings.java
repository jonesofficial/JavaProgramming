public class RemoveDupliFromStrings {
    public static void main(String[] args) {
        String str = "Programming";
        String s = str.toLowerCase();
        int l = 0;

        boolean freq[] = new boolean[26];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            int index = ch - 'a';

            if (freq[index] == false) {
                s.charAt(l = s.charAt(i);
                freq[index] = true;
                l++;
            }
        }
        System.out.println("Original string: " + str);
        System.out.println("String without duplicates: ");
        for (int i = 0; i < l; i++) {
            System.out.println(s.charAt(i));
        }
    }
}
