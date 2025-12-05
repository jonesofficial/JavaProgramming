public class CountVowels {
    public static void main(String[] args) {
        String str = "Hello guys1, my name is Jones";
        String s = str.toLowerCase().trim();

        int vowels = 0;
        int constants = 0;
        int sc = 0;
        int numbers = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                vowels++;
            } else if (s.charAt(i) == ' ' || s.charAt(i) == '!' || s.charAt(i) == '@' || s.charAt(i) == '#' || s.charAt(i) == ',' || s.charAt(i) == '.' || s.charAt(i) == '$' || s.charAt(i) == '%' || s.charAt(i) == '&' || s.charAt(i) == '*') {
                sc++;
            } else if (s.charAt(i) >= 49 && s.charAt(i) <= 57) {
                numbers++;
            } else {
                constants++;
            }
        }

        System.out.println(s);
        System.out.println("Total Vowels: " + vowels);
        System.out.println("Total Constants: " + constants);
        System.out.println("Total Special Characters: " + sc);
        System.out.println("Total Numbers: " + numbers);
    }
}
