package streamexample;

public class CalculateImpl implements Calculate {

    @Override
    public int sum(int varOne, int varTwo) {
        return (varOne + varTwo) * 2;
    }
}
