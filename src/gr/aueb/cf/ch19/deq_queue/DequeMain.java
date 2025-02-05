package gr.aueb.cf.ch19.deq_queue;

public class DequeMain {
    public static void main(String[] args) {
        //implementation of a stack
        MyQueue<Integer> intMyQueue = new MyQueue<>();

        intMyQueue.enQueue(1);
        intMyQueue.enQueue(2);
        intMyQueue.enQueue(3);
        intMyQueue.enQueue(4);

        int firstVal = intMyQueue.deQueue(); //delete with this
        System.out.println(firstVal);
        System.out.println();

        intMyQueue.forEach(System.out::println);
    }
}
