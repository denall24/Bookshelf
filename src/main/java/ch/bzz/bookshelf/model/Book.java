package ch.bzz.bookshelf.model;

import java.math.BigDecimal;

public class Book {
    private String bookUUID;
    private String title;
    private String author;
    private Publisher publisher;
    private BigDecimal price;
    private String isbn;

    public String getBookUUID() {
        return bookUUID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setBookUUID(String bookUUID) {
        this.bookUUID = bookUUID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
