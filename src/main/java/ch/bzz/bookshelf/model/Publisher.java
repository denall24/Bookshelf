package ch.bzz.bookshelf.model;

public class Publisher {
    private String publisherUUID;
    private String publisher;

    public String getPublisherUUID() {
        return publisherUUID;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisherUUID(String publisherUUID) {
        this.publisherUUID = publisherUUID;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
