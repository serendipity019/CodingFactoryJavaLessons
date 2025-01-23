package gr.aueb.cf.ch18.builder;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book.Builder(1, "12345").build(); // in the end with .build() we let empty the optional elements
        // Below we initiate and the optional elements.
        Book book2 = new Book.Builder(2, "6789")
                .author("Th")
                .title("Java")
                .build();


    }
}
