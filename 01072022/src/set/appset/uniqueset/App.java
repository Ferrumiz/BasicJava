package set.appset.uniqueset;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        String stringOne = "bbbbbb";
        String stringTwo = "abcdeed";
        String stringThree = "seelew";

        App app = new App();
        System.out.println(app.getMaximumSubstringLength(stringOne));
        System.out.println(app.getMaximumSubstringLength(stringTwo));
        System.out.println(app.getMaximumSubstringLength(stringThree));

    }

    private int getMaximumSubstringLength(String str) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int start = 0;
        for (int j = 0; j < str.length(); j++) {
            for (int i = j; i < str.length(); i++) {
                char tmp = str.charAt(i);
                while (set.contains(tmp)) {
                    set.remove(str.charAt(start));
                    start++;
                }
                set.add(tmp);
                max = Math.max(max, set.size());

            }
            set.clear();
        }
        return max;
    }
}
