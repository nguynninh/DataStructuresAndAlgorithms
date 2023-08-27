package list;

public class ArrayListIterator<T> implements Iterator<T> {
    private T[] data;
    private int currentPosition;

    public ArrayListIterator(T[] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < data.length && data[currentPosition] != null;
    }

    @Override
    public T next() {
        if (hasNext()) {
            return data[currentPosition++];
        }
        return null;

    }
}
