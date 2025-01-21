package gr.aueb.cf.ch17.default_static;

public class CodingWelcome implements IWelcome {
    // Hide method
    public static void staticMethod(){
        System.out.println("static method from codingWelcome hides Iwelcome");
    }

    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method in CodingWelcome");
        IWelcome.super.defaultMethod();
    }
}
