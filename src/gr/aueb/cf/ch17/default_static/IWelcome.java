package gr.aueb.cf.ch17.default_static;

public interface IWelcome {
    static void staticMethod() {
        System.out.println("Hello from Iwelcome static method");
    }

    default void defaultMethod() {
        System.out.println("Default method from Iwelcome");
    }
}
