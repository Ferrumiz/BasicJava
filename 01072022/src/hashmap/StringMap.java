package hashmap;

import java.util.HashMap;
import java.util.Map;

public class StringMap {
    public static void main(String[] args) {

        String one = "aabcfea";
        String two = "afe";

        StringMap stringMap = new StringMap();
        System.out.println("Can create " + two + " from " + one + " " + stringMap.canCreateString(one, two));

    }

    private boolean canCreateString(String one, String two) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < one.length(); i++) {
            char key = one.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (int i = 0; i < two.length(); i++) {
            char key = two.charAt(i);
            int value = map.getOrDefault(key, 0);
            if (value == 0) {
                return false;
            }
            if (value > 1) {
                map.put(key, value - 1);
            } else {
                map.remove(key);
            }
        }
        return true;
    }
}