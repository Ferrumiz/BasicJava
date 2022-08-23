package set;

import java.util.HashSet;
import java.util.Set;

// Доделать возврат из метода для двух и более значений в HashSet. Метод разбирали в классе
// в задаче работы с сетом при решении задачи с палиндромом.

public class AppPalindrome {
    public static void main(String[] args) {

        String stringOne = "aac";       //aca
        String stringTwo = "code";      //невозможно сделать палиндром
        String stringThree = "abab";    //abba

        AppPalindrome appPalindrome = new AppPalindrome();

        System.out.println("Is palindrome : " + stringOne + " " + appPalindrome.isPalindrome(stringOne));
        System.out.println("Is palindrome : " + stringTwo + " " + appPalindrome.isPalindrome(stringTwo));
        System.out.println("Is palindrome : " + stringThree + " " + appPalindrome.isPalindrome(stringThree));
    }

    private boolean isPalindrome(String string) {
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (!characterSet.add(c)) { //если операция "верна на false"
                characterSet.remove(c);
            }
        }
        return !(characterSet.size() > 1);
    }
}
