package gr.aueb.cf.ch9;

public class TraverseWithSubstr {
    public static void main(String[] args) {
        String s = " Athens Uni of Econ and Business";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(i, i+1));
        }
    }
}
