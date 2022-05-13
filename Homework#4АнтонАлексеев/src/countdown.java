public class countdown {
    public static void main(String[] args) {
        int i = 5;
        for (i = 5; i > 0; i--)
            System.out.println(i); //выводим цифры от 5 до 1
            if (i == 0) {          //когда доходим до нуля, вывести "start"
                System.out.println("start");
        }
    }
}
