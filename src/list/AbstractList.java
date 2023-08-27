package list;

public abstract class AbstractList<E> implements List<E> {
    @Override
    public String toString() {
        Iterator<E> iterator = iterator();
        if (!iterator.hasNext()) {
            return "[]";
        }

        StringBuilder result = new StringBuilder("[");
        while (true) {
            E element = iterator.next();
            result.append(element);
            if (!iterator.hasNext()) {
                return result.append("]").toString();
            }
            result.append(", ");
        }
    }

}
