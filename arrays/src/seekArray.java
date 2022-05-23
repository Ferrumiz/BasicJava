
/* Implement a method that returns how many times the given int are present in the given array
   ({10, 3, 23, 5, -9, 1, 3,-7},3) -> 2

   Ход задачи:
    взять элемент массива
    проверить, соответствует ли он заданному значению
    если да, то прибавить 1
    напечатать сумму единиц, соответствующих заданному значению
     */

public class seekArray {
    public static void main(String[] args) {
        int[] num = {10, 3, 23, 5, -9, 1, 3, -7};
        int a = 0;
        for (int i = 0; i < num.length; i++)
            if (num[i] == 2) {
                a = a + 1;
            }
        System.out.println(a);
    }
}
