package set;

import java.util.HashSet;
import java.util.Set;

public class AppPalindrome {
    public static void main(String[] args) {

        String stringOne = "aac";       //aca
        String stringTwo = "code";      //невозможно сдлать палиндром
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
            if (!characterSet.add(c)) {
                characterSet.remove(c);
            }
        }
        return !(characterSet.size() > 1);
    }
}
