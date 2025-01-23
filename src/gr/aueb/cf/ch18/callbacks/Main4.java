package gr.aueb.cf.ch18.callbacks;

public class Main4 {
    public static void main(String[] args) {

        // The difference with the Main3 is that use Method references
        doPrint(Main4::sayHelloWorld);

        doPrint(Main4::sayHelloCoding);

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
