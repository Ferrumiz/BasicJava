package set;

import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        //set-это множество уникальных элементов(нет повторяющихся элементов)
        //.contains- проверяет элементы на уникальность



        int[] intsOne = {2, 3, 4, 2, 5, 3, 4};
        int[] intsTwo = {2, 3, 4, 2, 5, 3, 4, 5};
        int[] intsThree = {2, 3, 4, 2, 5, 3, 4, 7};

        App app = new App();
        int singleElement = app.findSingleElement(intsOne);
        System.out.println("Single element : " + singleElement);

        int singleElementWithXOR = app.findSingleElementWithXOR(intsOne);
        System.out.println("Single element with XOR : " + singleElementWithXOR);

        int singleElementTwo = app.findSingleElementWithXOR(intsTwo);
        System.out.println("Single element two : " + singleElementTwo);

    }

    private int findSingleElementWithXOR(int[] intsOne) {
        int sum = 0;
        for (int i : intsOne) {
            sum = sum ^ i; // ^  - битовый оператор XOR
        }
        return sum;
    }

    // Изменить возвращаемое значение на int и обработать ситуацию
    //когда несколько уникальных элементов
    private int findSingleElement(int[] ints) {
        Set<Integer> integerSet = new HashSet<>();
        for (int i : ints) {
            if(integerSet.contains(i)){
                integerSet.remove(i);
            }else{
                integerSet.add(i);
            }
        }

         return integerSet.isEmpty() ? -1 : (int) integerSet.toArray()[0];
    }

}
