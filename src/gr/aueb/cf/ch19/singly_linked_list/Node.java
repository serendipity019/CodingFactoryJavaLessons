package gr.aueb.cf.ch19.singly_linked_list;

/**
 * Here we create a Dynamic list (Singly linked list) with nodes that have next.
 * next show in the next node
 * @param <T> generic type as parameter
 */
public class Node<T> {
    private T item;
    private Node<T> next;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
