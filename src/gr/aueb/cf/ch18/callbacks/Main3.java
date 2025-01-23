package gr.aueb.cf.ch18.callbacks;

public class Main3 {
    public static void main(String[] args) {

        // The difference with the Main2 is that create first one method and pass as lambda the method.
        doPrint(() -> sayHelloWorld());

        doPrint(() -> sayHelloCoding());

    }

    public static void doPrint(IPrintable printable) {
        printable.print();
    }

    public static void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    public static void sayHelloCoding() {
        System.out.println("Hello Coding");
    }
}
