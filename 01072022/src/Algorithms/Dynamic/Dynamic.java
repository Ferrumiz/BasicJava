package Algorithms.Dynamic;

public interface Dynamic {

    void add(int index);

    void add(int index, int data);

    void remove(int index);

    void removeAt(int index);

    void growSize();

    void shrinkSize();

    void set(int index, int data);

    int get(int index);

    void clear();

    boolean contains(int data);

    boolean isEmpty();

}
