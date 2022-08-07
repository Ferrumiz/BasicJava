package hippodrome;

public interface Raceable {

    void setPosition(int position);

    double step();

    boolean isFinished(int length);

    void printInformation();

}
