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
        int max = 0; // переменная для максимального количества неповторяющихся символов
        int start = 0; // переменная селектора начала отсчета нашей буквы
        for (int j = 0; j < str.length(); j++) { // общий цикл для проходки по слову
            char tmp = str.charAt(j); // выбираем букву на текущей позиции
            while (set.contains(tmp)) { // в случае, если сет содержит выбранную нами букву
                set.remove(str.charAt(start)); // удаляем из сета выбранную нами букву
                start++; // переносим селектор начала отсчета нашей буквы
            }
            set.add(tmp); // в случае, если сет не содержит нашей буквы, добавляем нашу букву в переменную tmp
            max = Math.max(max, set.size()); // записываем в переменную max максимальное количество неповторяющихся символов, если оно больше количества элементов сета.

        }
        return max;
    }
}
