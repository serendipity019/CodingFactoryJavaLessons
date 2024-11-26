package gr.aueb.cf.ch9;

/**
 * compares two strings for it (less than),
 * gt(greater than), eq (equal).
 */
public class StrCompareApp {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "ATHENS";

        if (s1.compareTo(s2) > 0){
            System.out.println(" s1 > s2");
        } else if (s1.compareTo(s2) < 0){
            System.out.println("s1 < s2");
        }else { // (s1.compareTo(s2) == 0)
            System.out.println("s1.equals(s2) == true");
        }

        if (s1.compareToIgnoreCase(s2) > 0){
            System.out.println(" s1 > s2");
        } else if (s1.compareToIgnoreCase(s2) < 0){
            System.out.println("s1 < s2");
        }else { // (s1.compareToIgnoreCase(s2) == 0)
            System.out.println("s1.equals(s2) == true");
        }
    }
}
