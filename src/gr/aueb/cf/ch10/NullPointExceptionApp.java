package gr.aueb.cf.ch10;

public class NullPointExceptionApp {
    public static void main(String[] args) {
        String s = null;

        // This is the wrong and give NullException
        if (s.equals("Athens")){
            System.out.println("Equals");
        }
        //This is the correct process.
        if (s != null && s.equals("Athens")){
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }


    }
}
