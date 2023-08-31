package tree;

import list.Iterator;

public interface Tree<T> {
    boolean isEmpty();
    int size();
    int height();
    boolean contains(T element);
    boolean add(T element);
    boolean remove(T element);
    Iterator<T> traverse(TreeTraverseType type);
}