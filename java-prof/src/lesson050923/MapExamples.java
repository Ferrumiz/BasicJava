package lesson050923;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExamples {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Tom", 32);
        hashMap.put("Mary", 29);
        hashMap.put("John", 33);
        hashMap.put("Peter", 19);

        System.out.println(hashMap);

        Integer value = hashMap.get("Mary");
        System.out.println(value);
        System.out.println(hashMap.containsKey("May"));

//        Set<String> stringSet = hashMap.keySet();
//        System.out.println(stringSet);
//
//        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
//        for (Map.Entry<String, Integer> e : entries ) {
//            System.out.println("Key = " + e.getKey());
//            System.out.println("Value = " + e.getValue());
//        }
//
//        for (String key : hashMap.keySet()){
//            Integer v = hashMap.get(key);
//            System.out.println("Key: " + key + "\nValue: " + v);
//        }

        
    }

}
