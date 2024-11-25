package gr.aueb.cf.ch9;

public class IndexOfSubstringApp {
    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo= cf.indexOf("o"); //is the index 1
        int positionOfSecondo = cf.indexOf("0", 2);
        int lastPositionOfo = cf.lastIndexOf("o");

        String cf2 = cf.substring(1); // "oding Factory"
        String slice = cf.substring(1,3); // This give "od"
    }
}
