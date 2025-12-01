import java.util.HashMap;

public class FrequencyOfAllCharacters {
    public static void main(String[] args) {
        String s = "banana";
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray()){
                map.put(c, map.getOrDefault(c,0)+1);
        }

        map.entrySet().removeIf(entry -> entry.getValue()<2);

        System.out.println("Character with most frequencies is");
        System.out.println(map);
    }
}
