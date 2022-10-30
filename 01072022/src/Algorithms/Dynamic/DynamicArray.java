package Algorithms.Dynamic;

public class DynamicArray {

    private int capacity;
    private int array[];
    private int count;
    private int size;

    public DynamicArray() {
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
