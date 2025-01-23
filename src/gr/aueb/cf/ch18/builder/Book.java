package gr.aueb.cf.ch18.builder;

public class Book {
    private final long id;
    private final String isbn;
    private final String author;
    private final String title;

    public static class Builder {
        //These are mandatory
        private final long id;
        private final String isbn;
        // These are optionally
        private String author = "";
        private String title = "";

        //We make this for the mandatory elements
        public Builder(long id, String isbn) {
            this.id = id;
            this.isbn = isbn;
        }

        // setters for the optionals

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }
        // With this we give access to the private constructor.
        public Book build() {
            return new Book(this);
        }
    }

    // This is the private constructor for the first 4 elements with the getters of them
    private Book(Builder builder) {
        this.id = builder.id;
        this.author = builder.author;
        this.title = builder.title;
        this.isbn = builder.isbn;
    }

    public long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
