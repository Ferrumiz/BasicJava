public class HomeWork3PrimeNumber {

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(239)); // must print true
        System.out.println(isPrimeNumber(7)); // must print true
        System.out.println(isPrimeNumber(6)); // must print false
    }

    /**
     * https://en.wikipedia.org/wiki/Prime_number
     *
     * @param number - integer number > 0
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrimeNumber(int number) {
        if ((number - 1) % 2 == 0)
            return true;
        else
            return false;
    }

}
