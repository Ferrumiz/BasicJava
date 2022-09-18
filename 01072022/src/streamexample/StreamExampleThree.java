package streamexample;

import java.util.Comparator;

public class StreamExampleThree {

    public static void main(String[] args) {

        StreamEvent streamEventOne = new StreamEvent();
        StreamEvent streamEventTwo = new StreamEvent();

        Comparator<StreamEvent> streamEventComparator = new Comparator<StreamEvent>() {
            @Override
            public int compare(StreamEvent o1, StreamEvent o2) {
                return o1.getMessage().compareTo(o2.getMessage());
            }
        };

        Comparator<StreamEvent> streamEventComparatorOne = (o1, o2) -> o1.getMessage().compareTo(o2.getMessage());



        StreamExampleInt streamExampleInt = (valueOne, valueTwo) -> valueOne + valueTwo;


    }

}
