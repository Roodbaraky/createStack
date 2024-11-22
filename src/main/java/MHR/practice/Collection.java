package MHR.practice;

import java.util.ArrayList;

public interface Collection {
        ArrayList<Object> storage = new ArrayList<>();
        void add(Object item);
        void remove();
        Object peek();
        boolean isEmpty();
        int size();
}
