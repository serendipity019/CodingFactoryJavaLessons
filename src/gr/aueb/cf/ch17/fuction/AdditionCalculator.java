package gr.aueb.cf.ch17.fuction;

public class AdditionCalculator implements ICalculator{
    @Override
    public int operate(int a, int b) {
        return a + b;
    }
}
