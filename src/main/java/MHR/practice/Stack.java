package MHR.practice;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Object> storage;
    private int quantity;
    private int limit = Integer.MAX_VALUE;

    public int getQuantity() {
        return quantity;
    }

    private Stack() {
        this.storage = new ArrayList<>();
        this.quantity = 0;
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
        if(!this.isEmpty()) {
            Object temp = storage.getLast();
            storage.remove(storage.removeLast());
            return temp;
        }
        return storage;
    }

    public boolean isEmpty() {
        return storage.isEmpty();
    }

    public boolean isFull() {
        return storage.size() == limit;
    }

    public Object peek() {
        return storage.getLast();
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}
