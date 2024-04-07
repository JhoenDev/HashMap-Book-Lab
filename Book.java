public class Book {
    private String isbn;
    private String title;
    private Author author;

    Book(String isbn, String title) {
        this.title = title;
        this.isbn = isbn;
    }
    
    public Author getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
}