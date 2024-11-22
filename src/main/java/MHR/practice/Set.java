package MHR.practice;

import java.util.ArrayList;

public class Set {
    ArrayList<Object> storage;
    int capacity = Integer.MAX_VALUE;

    private Set() {
        storage = new ArrayList<>();

    }

    private Set(int capacity) {
        this.capacity=capacity;
        storage = new ArrayList<>(capacity);
    }

    private Set(Object[] array) {
        this();
        for (int i = 0; i < array.length - 1; i++) {
            if (storage.isEmpty()) {
                storage.add(array[i]);
            }
            for (int j = 0; j < storage.size(); j++) {
                if (array[i] != storage.get(j)) {
                    storage.add(array[i]);
                }
            }
        }
    }

    public static Set setFromArray(Object[] array) {
        return new Set(array);
    }

    public static Set createSet() {
        return new Set();
    }

    public static Set createSet(int capacity) {
        return new Set(capacity);
    }

    public int size() {
        return storage.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }
    public boolean isFull() {
        return size() == capacity;
    }

    public int getCapacity(){
        return capacity;
    }

    public void add(Object item) {
        if (!storage.contains(item)&&!isFull()) {
            storage.add(item);
        }

    }

    public void remove(Object item){
        storage.remove(item);
    }

    @Override
    public String toString() {
        storage.sort(null);
        return storage.toString();
    }
}


