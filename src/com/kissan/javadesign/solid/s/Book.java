package com.kissan.javadesign.solid.s;

public class Book implements BookHandler{
    private String author;
    private int numOfPages;
    //Composition is preferred over Inheritence
    private BookPersistence bookPersistence;

    public Book(String author, int numOfPages) {
        this.author = author;
        this.numOfPages = numOfPages;
        this.bookPersistence = new BookPersistence();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    // Seperate the saving behaviour from the core class objective
    // This way save method can be implemented/changed independently
    @Override
    public void save() {
        this.bookPersistence.save(this);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", numOfPages='" + numOfPages + '\'' +
                '}';
    }
}
