package list;

public class LinkedList<E> extends AbstractList<E> {
    private LinkedListNode head;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(E element) {
        LinkedListNode current = head;
        while (current != null) {
            if (current.getData().equals(element)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public List add(E element) {
        insert(element, size);
        return this;
    }

    @Override
    public List append(E element) {
        /* TODO */
        insert(element, size);
        return this;
    }


    @Override
    public E remove(E element) {
        if (head == null) {
            return null;
        }

        if (head.getData().equals(element)) {
            E removedData = (E) head.getData();
            head = head.getNext();
            size--;
            return removedData;
        }

        LinkedListNode current = head;
        while (current.getNext() != null) {
            if (current.getNext().getData().equals(element)) {
                E removedData = (E) current.getNext().getData();
                current.setNext(current.getNext().getNext());
                size--;
                return removedData;
            }
            current = current.getNext();
        }

        return null;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }


    @Override
    public E get(int index) {
        LinkedListNode node = getNodeByIndex(index);
        if (node == null) {
            return null;
        }
        return (E) node.getData();

    }

    @Override
    public E set(int index, E element) {
        checkBoundaries(index, size - 1);

        LinkedListNode current = getNodeByIndex(index);
        E oldData = (E) current.getData();
        current.setData(element);

        return oldData;
    }

    @Override
    public void add(E element, int index) {
        insert(element, index);
    }

    @Override
    public void insert(E element, int index) {
        try {
            checkBoundaries(index, size);
            if (index == 0) {
                head = new LinkedListNode(element, head);
            } else {
                LinkedListNode current = getNodeByIndex(index - 1);
                current.setNext(new LinkedListNode(element, current.getNext()));
            }
            size++;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Can't add " + element + " at index " + index);
        }
    }


    @Override
    public E remove(int index) {
        try {
            checkBoundaries(index, size - 1);
            LinkedListNode removedNode;
            if (index == 0) {
                removedNode = head;
                head = head.getNext();
            } else {
                LinkedListNode current = getNodeByIndex(index - 1);
                removedNode = current.getNext();
                current.setNext(current.getNext().getNext());
            }
            size--;
            return (E) removedNode;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Can't remove object at index " + index);
            return null;
        }


    }

    @Override
    public int indexOf(E element) {
        int index = 0;
        LinkedListNode current = head;

        while (current != null) {
            if (current.getData().equals(element)) {
                return index;
            }
            index++;
            current = current.getNext();
        }

        return -1;
    }

    @Override
    public int lastIndexOf(E element) {
        int lastIndex = -1;
        int index = 0;
        LinkedListNode current = head;

        while (current != null) {
            if (current.getData().equals(element)) {
                lastIndex = index;
            }
            index++;
            current = current.getNext();
        }

        return lastIndex;
    }


    @Override
    public Iterator iterator() {
        return new LinkedListIterator(head);
    }

    private LinkedListNode getNodeByIndex(int index) {
        LinkedListNode current = null;
        try {
            checkBoundaries(index, size);
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Can't get node at index " + index);
        }
        return current;
    }

    private void checkBoundaries(int index, int limit) {
        if (index < 0 || index > limit) {
            throw new IndexOutOfBoundsException();
        }
    }

}

