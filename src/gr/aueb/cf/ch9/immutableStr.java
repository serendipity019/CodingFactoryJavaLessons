package gr.aueb.cf.ch9;

public class immutableStr {
    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = "Coding";

        s2 = "Factory"; // When we do this the s1 remain unchangeable.
        s1 = "Athens";
    }
}
