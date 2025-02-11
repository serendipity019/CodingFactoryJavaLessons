package gr.aueb.cf.ch20;

public class RegExMain {
    public static void main(String[] args) {
        String s = "info@net.gr panos";
        System.out.println(isRed(s));
        System.out.println(oneWordEndIng(s));
        System.out.println(whiteSpaceDigit(s));
        System.out.println(isEmail(s));
        String s1 = " Athens Uni     of Eco      and      Bus";
        String[] tokens = doSplit(s1);
        for(String token : tokens) {
            System.out.print(token + " ");
        }
        System.out.println();
        System.out.println(doReplace(s1));
        System.out.println(doReplaceBackReference(s));



    }

    /**
     * Check (matches) if the input string is "red"
     * @param s string value
     * @return boolean
     */
    public static boolean isRed(String s) {
        return s.matches("red");
    }

    /**
     * Check (matches) if the input string is "red" or "green
     * @param s string value
     * @return boolean
     */
    public static boolean isRedOrGreen(String s) {
        return s.matches("red | green");
    }

    /**
     * Check (matches) if the input string is "red" or "green or "Red" or "Green"
     * @param s string value
     * @return boolean
     */
    public  static boolean isrRedOrgGreen(String s) {
        return s.matches("[rR]ed | [gG]reen"); // character set inside []
    }

    // Begins with one uppercase and ends in ing
    public static boolean BWUpperAEIg(String s) {
        return s.matches("[A-Z]ing");
    }

    public static boolean oneWordEndIng(String s) {
        return s.matches("[A-Za-z]ing");
    }

    public static boolean whiteSpaceDigit(String s) {
        return s.matches("\\s\\d");
    }

    public static boolean anySymbolDigit(String s) {
        return s.matches(".\\d");
    }

    //simple morph of email
    public static boolean isEmail(String s) {
        return s.matches("\\w*\\.?@\\w+\\.[a-z]{2,4}");
    }

    public static boolean isDate(String s) {
        return s.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    public static String[] doSplit(String s) {
        return s.split("\\s+");
    }

    public static String doReplace(String s) {
        return s.replaceAll("\\s+", " ");
    }

    //groups inside( )
    public static String doReplaceBackReference(String s) {
        return s.replaceAll("(.+)\\s+(.+)", "$2 $1");
    }
}
