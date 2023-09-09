package stack;

import list.Iterable;

public interface Stack<E> extends Iterable<E> {
    int size();
    boolean empty();

    E peek();

    E pop();

    E push(E element);

    int search(E element);
}
