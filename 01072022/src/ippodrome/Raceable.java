package ippodrome;

public interface Raceable {

    void setPosition(int position);

    void step();

    boolean isFinished(int length);

    void printInformation();

}
