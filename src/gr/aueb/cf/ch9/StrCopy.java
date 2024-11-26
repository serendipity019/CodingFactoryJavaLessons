package gr.aueb.cf.ch9;

/**
 * Ta Strings είναι immutable και δεν επηρεάζει το αντίγραφο
 * της αναφοράς. οπότε έχουμε έγκυρο copy με αντιγραφή
 * της αναφοράς.
 */
public class StrCopy {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = s1;
    }
}
