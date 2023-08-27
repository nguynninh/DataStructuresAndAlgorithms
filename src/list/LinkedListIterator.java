package list;

public class LinkedListIterator<E> implements Iterator<E> {
    private LinkedListNode currentLinkedListNode;

    public LinkedListIterator(LinkedListNode linkedListNode) {
        this.currentLinkedListNode = linkedListNode;
    }


    @Override
    public boolean hasNext() {
        return currentLinkedListNode != null;
    }

    @Override
    public E next() {
        if (hasNext()) {
            E payload = (E) currentLinkedListNode.getData();
            currentLinkedListNode = currentLinkedListNode.getNext();
            return payload;
        }
        return null;

    }
}
