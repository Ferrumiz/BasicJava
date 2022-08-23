package hashmap;

import java.util.HashMap;
import java.util.Map;

public class AppMapCount {

    public static void main(String[] args) {
        String string = "dfsdfsdgjnfdkgjsldkffjkdsf";
        Map<Character, Integer> map = new HashMap<>();
        AppMapCount appMapCount = new AppMapCount();
        appMapCount.countCharsEntry(map, string);

        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            Character key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println("Key = " + key + ", count = " + value);
        }
    }

    private void countCharsEntry(Map<Character, Integer> map, String string) {
        for (int i = 0; i < string.length(); i++) {
            char tmp = string.charAt(i);
            map.put(tmp, map.getOrDefault(tmp, 0) + 1);
        }
    }
}
