package MHR.practice;

import java.util.ArrayList;

public class Queue implements Collection {
    private final ArrayList<Object> storage;
    private int quantity;
    private int limit = Integer.MAX_VALUE;

    private int front;
    private int back;

    private Queue(int maxSize) {
        this.storage = new ArrayList<>(maxSize);
        this.limit=maxSize;
    }

    public static Queue createQueue(int maxSize) {
        return new Queue(maxSize);
    }

    @Override
    public void add(final Object item) {
        enQueue(item);
    }

    @Override
    public void remove() {
        deQueue();
    }

    @Override
    public Object peek() {
        if (!isEmpty()) {
            return storage.getFirst();
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return quantity == 0;
    }

    @Override
    public int size() {
        return storage.size();
    }

    public void enQueue(Object item) {
        if (!this.isFull()) {
            storage.add(item);
            back++;
            quantity = storage.size();
        }
    }

    public void deQueue() {
        if (!isEmpty()) {
            storage.removeFirst();
            back--;
            quantity=storage.size();
        }
    }

    public boolean isFull() {
        return back == limit;
    }


@Override
public String toString() {
    return storage.toString();
}
}

