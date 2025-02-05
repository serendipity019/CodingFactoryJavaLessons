package gr.aueb.cf.ch19.deq_stack;


public class DequeuMain {
    public static void main(String[] args) {
        //implementation of a stack
        MyStack<Integer> intStack = new MyStack<>();

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);

        int topVal = intStack.pop();
        System.out.println(topVal);
        System.out.println();

        intStack.forEach(System.out::println);
    }
}
