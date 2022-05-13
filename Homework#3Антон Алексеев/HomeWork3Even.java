public class HomeWork3Even {

    public static void main(String[] args) {
        System.out.println(isEven(13)); // must print false
        System.out.println(isEven(10)); // must print true
    }

    /**
     * @param number - input to be checked
     * @return true if the number is even, false otherwise
     */
    public static boolean isEven(int number) {
        if (number % 2 == 0)
            return true;
        else
            return false;
    }

}
