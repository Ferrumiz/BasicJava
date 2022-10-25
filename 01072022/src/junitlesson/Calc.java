package junitlesson;

public class Calc {

    public int add(int a, int b) {
        return a + b;
    }

    public int division(int a, int b) {
        if (b == 0) {
            throw new IncorrectParameterException("Division by zero");
        }

        if (b < 0 || a < 0) {
            throw new IncorrectParameterException("Negative parameter - " + (a < 0 ? "a" : "b"));
        }

        return a / b;
    }
}
