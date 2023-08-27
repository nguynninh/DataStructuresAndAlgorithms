package list;

public interface List<E> extends Iterable {
    int size();
    boolean isEmpty();
    boolean contains(E element);
    List add(E element);
    List append(E element);
    E remove(E element);
    void clear();
    E get(int index);
    E set(int index, E element);
    void add(E element,int index);
    void insert(E element, int index);
    E remove(int index);
    int indexOf(E element);
    int lastIndexOf(E element);
}

