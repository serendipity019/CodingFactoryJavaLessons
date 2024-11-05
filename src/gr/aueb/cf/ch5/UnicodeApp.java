package gr.aueb.cf.ch5;

public class UnicodeApp {
    public static void main(String[] args) {
        int codePoint = 0x1F600;

        System.out.println("Smile: \uD83D\uDE03");

        // or you can make
        System.out.print("smiley: ");
        System.out.println(Character.toChars(codePoint));
    }
}
