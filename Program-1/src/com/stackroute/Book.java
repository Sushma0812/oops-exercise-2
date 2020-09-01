package com.stackroute;

/*
 *This class is used to dispaly book details
 */
public class Book {
    private long isbn;
    private String title;
    private String edition;
    private Author author;

    public Book(long isbn, String title, String edition, Author author) {
        this.isbn = isbn;
        this.title = title;
        this.edition = edition;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getEdition() {
        return edition;
    }

    public void Book() {
        System.out.println("This is default constructor");
    }

    public String getBookDetails() {
        System.out.println("Booka{isbn=" + this.isbn + ",title=" + this.title + ",edition=" + this.edition);
        return null;

    }

}

