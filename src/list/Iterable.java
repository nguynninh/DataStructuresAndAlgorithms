package list;

public interface Iterable<E> {
    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    Iterator<E> iterator();
}
