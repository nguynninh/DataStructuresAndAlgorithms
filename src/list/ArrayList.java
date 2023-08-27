package list;

import java.util.Arrays;

public class ArrayList<E> extends AbstractList<E> {
    private static final int DEFAULT_CAPACITY = 2;
    private E[] data;
    private int size;

    public ArrayList() {
        this.data = (E[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E element) {
        if (element == null) return false;
        for (E e : data)
            if (element.equals(e))
                return true;
        return false;
    }

    @Override
    public List add(E element) {
        if (data.length == size())
            enlarge();
        data[size++] = element;
        return this;
    }

    @Override
    public List append(E element) {
        return add(element);
    }

    @Override
    public E remove(E element) {
        if (element == null)
            throw new NullPointerException();
        for (int i = 0; i < size(); i++) {
            if (data[i].equals(element)) {
                E removedElement = data[i];
                for (int j = i; j < size() - 1; j++) {
                    data[j] = data[j + 1];
                }
                data[size-- - 1] = null;
                return removedElement;
            }
        }
        return null;
    }


    @Override
    public void clear() {
        for (int i = 0; i < size(); i++) {
            data[i] = null;
        }
        size = 0;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();
        return data[index];
    }

    @Override
    public E set(int index, E element) {
        if (index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();
        return data[index] = element;
    }

    @Override
    public void add(E element, int index) {
        if (index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();
        if (size == data.length) enlarge();
        for (int i = size++; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = element;
    }

    @Override
    public void insert(E element, int index) {
        add(element, index);
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();
        E ele = data[index];
        for (int i = index; i < size() - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size-- - 1] = null;
        return ele;
    }

    @Override
    public int indexOf(E element) {
        for (int i = 0; i < size(); i++) {
            if (element.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E element) {
        for (int i = size() - 1; i >= 0; i--) {
            if (element.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public Iterator iterator() {
        return new ArrayListIterator<>(data);
    }

    private void enlarge() {
        data = Arrays.copyOf(data, data.length * 2);
    }

}

