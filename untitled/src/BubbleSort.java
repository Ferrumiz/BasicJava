/*Попарно переставить элементы

взять 2 элемента
сравнить
если первый больше второго, переставить его на место первого
вывести */

import java.util.Arrays;
public class BubbleSort {
        public static void main(String[] args) {
            int [] mas = {1,4,2,6,9,-3,-1,0};
            int buf = 0;
                for (int i = 0; i < mas.length; i=i+2) {
                    if(mas[i] > mas[i+1]){
                        buf = mas[i];
                        mas[i] = mas[i+1];
                    }
                }
            System.out.println(Arrays.toString(mas));
            }
        }

