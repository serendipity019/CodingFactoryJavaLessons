package gr.aueb.cf.ch18.callbacks;

public class Main {
    public static void main(String[] args) {
        //Anonymous class
        doPrint(new IPrintable() {
            @Override
            public void print() {
                System.out.println("Hello World");
            }
        });
        // Anonymous Class
        doPrint(new IPrintable() {
            @Override
            public void print() {
                System.out.println("Hello Coding!");
            }
        });

    }

    //This is callback
    public static void doPrint(IPrintable printable) {
        printable.print();
    }
}
