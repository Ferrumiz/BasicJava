package logparser.model;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class Log implements Comparable<Log>{

    private String address;
    private int count;

    public Log(String address, int count) {
        this.address = address;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Log{" +
                "address='" + address + '\'' +
                ", count=" + count +
                '}';
    }

    public String getAddress() {
        return address;
    }

    @Override
    public int compareTo(@NotNull Log o) {
        return address.compareTo(o.getAddress());
    }
}
