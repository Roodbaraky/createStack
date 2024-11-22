package MHR.practice;

import java.util.AbstractList;

public interface Collection {
        AbstractList<Object> storage = new AbstractList<>() {
            @Override
            public Object get(final int index) {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }
        };
        void add(Object item);
        boolean isEmpty();
        int size();

    void remove();
}
