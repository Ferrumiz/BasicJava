package stack;

import org.jetbrains.annotations.NotNull;

import java.awt.event.ItemEvent;
import java.util.*;

public class Application {

    public static void main(String[] args) {
        OurStack<Character> ourStack = new OurStack<>();
        Stack<Character> characterStack = new Stack<>();

        String ptsOne = "{}()[]";   //true
        String ptsTwo = "{]";       //false
        String ptsThree = "{[()]}";   //true
        String ptsFour = "{([)]}";   //false
        // написать метод, который будет проверять, корректно ли расположены скобки в строке.

        Application application = new Application();
        System.out.println("Is valid " + ptsOne + " = " + application.isValid(ptsOne, characterStack));
        System.out.println("Is valid " + ptsThree + " = " + application.isValid(ptsThree, ourStack));


        ArrayDeque<Character> characterArrayDeque = new ArrayDeque<>();
        System.out.println("Is valid " + ptsThree + " = " + application.isValid(ptsThree, characterArrayDeque));

    }

    public boolean isValid(String string, Stack<Character> stack) {
        Map<Character, Character> map = getCharacterCharacterMap();
        for (int i = 0; i < string.length(); i++) {
            char temp = string.charAt(i);
            if (map.containsKey(temp)) {     //если мапа содержит закрывающую скобку
                char peek = stack.peek();   //взять предыдущий эл-т. из стека
                if (peek == map.get(temp)) { //и сравнить, является. ли он открывающей скобкой.
                    stack.pop();            //если является, то удалить объекты из стэка
                } else {                    //а если вдруг пара не нашлась (открвыающая скобка не равна зкарывающей)
                    stack.push(temp);       //добавить элемент в стэк
                }
            } else {                        //иначе
                stack.push(temp);           //поместить объект в наш стэк
            }
        }
        return stack.empty();               //если стэк в конце оказался пустым, то строки валидны. В ином случае- не валидны
    }

    public boolean isValid(String string, OurStack<Character> stack) {
        Map<Character, Character> map = getCharacterCharacterMap();
        checkStack(string, stack, map);
        return stack.empty();               //если стэк в конце оказался пустым, то строки валидны. В ином случае- не валидны
    }

    private void checkStack(String string, Stack<Character> stack, Map<Character, Character> map) {
        for (int i = 0; i < string.length(); i++) {
            char temp = string.charAt(i);
            if (map.containsKey(temp)) {     //если мапа содержит закрывающую скобку
                char peek = stack.peek();   //взять предыдущий эл-т. из стека
                if (peek == map.get(temp)) { //и сравнить, является. ли он открывающей скобкой.
                    stack.pop();            //если является, то удалить объекты из стэка
                } else {                    //а если вдруг пара не нашлась (открвыающая скобка не равна зкарывающей)
                    stack.push(temp);       //добавить элемент в стэк
                }
            } else {                        //иначе
                stack.push(temp);           //поместить объект в наш стэк
            }
        }
    }

    public boolean isValid(String string, ArrayDeque<Character> stack) {
        Map<Character, Character> map = getCharacterCharacterMap();
        checkStackByArrayDequeue(string, stack, map);
        return stack.isEmpty();               //если стэк в конце оказался пустым, то строки валидны. В ином случае- не валидны
    }

    private void checkStackByArrayDequeue(String string, ArrayDeque<Character> stack, Map<Character, Character> map) {
        for (int i = 0; i < string.length(); i++) {
            char temp = string.charAt(i);
            if (map.containsKey(temp)) {     //если мапа содержит закрывающую скобку
                char peek = stack.peek();   //взять предыдущий эл-т. из стека
                if (peek == map.get(temp)) { //и сравнить, является. ли он открывающей скобкой.
                    stack.pop();            //если является, то удалить объекты из стэка
                } else {                    //а если вдруг пара не нашлась (открвыающая скобка не равна зкарывающей)
                    stack.push(temp);       //добавить элемент в стэк
                }
            } else {                        //иначе
                stack.push(temp);           //поместить объект в наш стэк
            }
        }
    }

    private Map<Character, Character> getCharacterCharacterMap() {
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        return map;
    }
}