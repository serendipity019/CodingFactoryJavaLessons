package gr.aueb.cf.ch4;

public class SpecialWhileTypes {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 0){
            System.out.println("Never gets in");
        }

        while (i < 1){
            System.out.println("Never gets in");
        }

        while (i <=1){
            System.out.println("One time gets in");
        }

        while (true){
            System.out.println("For Ever");
        }
    }
}
