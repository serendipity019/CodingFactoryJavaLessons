package gr.aueb.cf.ch19.doubly_linked_list;

public class DoublyLinkedList<T> {
    private Node<T> head = null;
    private Node<T> tail = null;

    /**
     * Method to insert in first place. Time complexity O(1)
     * @param t the value to be inserted.
     */
    public void insertFirst(T t) {
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(head);
        tmp.setPrev(null);

        if (head == null) tail = tmp;
        else head.setPrev(tmp);

        head = tmp;
    }

    /**
     * Method to insert in the last position of a list. Time complexity O(1) because we have the tail
     * and don't need to make traverse the list.
     * @param t the value to be inserted.
     */
    public void insertLast(T t) {
        if (head == null) {
            insertFirst(t);
            return;
        }

        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(null);
        tmp.setPrev(tail);

        tail.setNext(tmp);
        tail = tmp;
    }


}
