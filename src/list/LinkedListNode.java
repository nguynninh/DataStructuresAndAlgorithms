package list;

public class LinkedListNode<E> {
    private E data;
    private LinkedListNode next;

    public LinkedListNode(E data) {
        this.data = data;
    }

    public LinkedListNode(E data, LinkedListNode next) {
        this.data = data;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E payload) {
        this.data = payload;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
}
