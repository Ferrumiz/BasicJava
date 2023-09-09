package homework5;

public class NewClass {
    public static void main(String[] args) {
        System.out.println(new NewClass().isPrime(100));
    }

    public boolean isPrime(int number) {
        if (number < 2) return false;

        for (int i = 2; i * i <= number; i++) { //ctrl alt l
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
