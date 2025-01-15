package gr.aueb.cf.ch14.exceptions;

public class NegativeAmountException extends Exception {
    public NegativeAmountException(double amount) {
        super("Amount " + amount + " is sufficient.");
    }
}
