package MHR.practice;

import java.util.ArrayList;

public class Stack implements Collection {
    private final ArrayList<Object> storage;
    private int quantity;
    private int limit = Integer.MAX_VALUE;

    public int getQuantity() {
        return quantity;
    }

    private Stack() {
        this.storage = new ArrayList<>();
    }

    private Stack(int limit) {
        this();
        this.limit = limit;
    }

    public static Stack createStack() {
        return new Stack();
    }

    public static Stack createStack(int limit) {
        return new Stack(limit);
    }

    public void push(Object item) {
        if (!this.isFull()) {
            storage.add(item);
        }
        quantity = storage.size();
    }

    public Object pop() {
        if (!this.isEmpty()) {
            Object temp = storage.getLast();
            storage.remove(storage.removeLast());
            quantity = storage.size();
            return temp;

        }
        return storage;
    }

    public boolean isEmpty() {
        return storage.isEmpty();
    }

    @Override
    public int size() {
        return quantity;
    }

    public boolean isFull() {
        return storage.size() == limit;
    }

    @Override
    public void add(final Object item) {
        push(item);
    }

    @Override
    public void remove() {
         pop();
    }

    public Object peek() {
        return storage.getLast();
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}
