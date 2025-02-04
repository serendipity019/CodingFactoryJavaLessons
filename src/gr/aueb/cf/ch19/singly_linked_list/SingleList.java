package gr.aueb.cf.ch19.singly_linked_list;

public class SingleList<T> {
    private Node<T> head = null;

    /**
     * time-complexity O(1)
     * @param t the value to be inserted.
     */
    public void insertFirst(T t){
        //here make the new node
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(head);//take the value of the head

        //here we change the head to show the new node
        head = tmp;
    }

    /**
     * Time complexity O(n)
     * @param t the value to be inserted
     */
    public void insertLast(T t) {
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(null); // because is the last must have null

        if (head == null) {
        insertFirst(t);
        return;
        }

        Node<T> n;
        for (n = head; n.getNext() != null; n = n.getNext()) {

        }
        n.setNext(tmp);
    }

    /**
     * If want to delete the first node from a dynamic list the time complexity is O(1)
     * @return the removed node.
     */
    public Node<T> removeFirst() {
        if (head == null) return null;

        Node<T> node = head;
        head = head.getNext();
        return node; //if don't return then we will lose the history
    }

    /**
     * To delete the last node of a dynamic list the time complexity is O(n)
     * @return the removed node.
     */
    public Node<T> removeLast() {
        if (head == null || head.getNext() == null) {
            return removeFirst();
        }

        Node<T> n;
        for (n = head; n.getNext().getNext() != null; n = n.getNext()){

        }
        Node<T> nodeToReturn = n.getNext();
        n.setNext(null);
        return nodeToReturn;
    }
}
