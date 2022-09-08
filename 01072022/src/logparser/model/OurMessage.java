package logparser.model;

import logparser.external.Message;
import org.jetbrains.annotations.NotNull;

public class OurMessage extends Message implements Comparable<OurMessage> {
    public OurMessage(String text, int length) {
        super(text, length);
    }

    @Override
    public int compareTo(@NotNull OurMessage o) {
        return Integer.compare(super.getLength(), o.getLength());
    }
}
