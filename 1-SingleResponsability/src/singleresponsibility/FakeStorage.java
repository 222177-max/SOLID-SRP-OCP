package singleresponsibility;

import java.util.ArrayList;
import java.util.List;

public class FakeStorage<T> {

    private List<T> collection;

    public FakeStorage() {
        collection = new ArrayList<>();
    }

    public T add(T item) {
        collection.add(item);
        return item;
    }

    public T remove(T item) {
        collection.remove(item);
        return item;
    }

    public List<T> getAll() {
        return collection;
    }
}
