package gr.aueb.cf.ch15.services;

public class CodingFactorySingleton {
    //Eager policy (Activated immediately)
    private static final CodingFactorySingleton INSTANCE = new CodingFactorySingleton();

    private CodingFactorySingleton() {

    }

    public static CodingFactorySingleton getINSTANCE() {
        return INSTANCE;
    }

    public void sayHello() {

    }
}
