package set;

import linkedlist.MyNode;

import java.util.HashSet;
import java.util.Set;

// Доделать возврат из метода для двух и более значений в HashSet. Метод разбирали в классе
// в задаче работы с сетом при решении задачи с палиндромом.

public class AppPalindrome {

    private Node firstNode;

    public static void main(String[] args) {
        AppPalindrome appPalindrome = new AppPalindrome();
        Node stringThree = new Node("abab", null);
        Node stringTwo = new Node("code", stringThree);
        Node stringOne = new Node("aac", stringTwo);       //aca

        appPalindrome.firstNode = stringOne;
        Node curr = appPalindrome.firstNode;

        while (curr != null) {
            if (appPalindrome.isPalindrome(curr.value)) {
                System.out.println("String " + "«" + curr.value + "»" + " is palindrome");
            } else {
                System.out.println("String " + "«" + curr.value + "»" + " is not a palindrome");

            }
            curr = curr.nextElement;
        }
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
