package stack;

import list.ArrayList;
import list.Iterator;

import java.util.EmptyStackException;

public class ArrayBasedStack<E> implements Stack<E> {
    private final ArrayList<E> array;
    private int index = -1;

    public ArrayBasedStack(int initSize) {
        this.array = new ArrayList<>(initSize);
    }

    public ArrayBasedStack() {
        this.array = new ArrayList<>();
    }

    @Override
    public int size() {
        return index + 1;
    }

    @Override
    public boolean empty() {
        return array.isEmpty();
    }

    @Override
    public E peek() {
        return array.get(index);
    }

    @Override
    public E pop() {
        if (array.isEmpty())
            throw new EmptyStackException();
        return array.remove(index--);
    }

    @Override
    public E push(E element) {
        array.add(element);
        index++;
        return element;
    }

    @Override
    public int search(E element) {
        return array.indexOf(element);
    }

    @Override
    public Iterator<E> iterator() {
        return array.iterator();
    }
}
