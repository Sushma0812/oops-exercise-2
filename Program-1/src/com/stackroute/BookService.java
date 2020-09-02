package com.stackroute;

/*
 *This class is used to generate aggrgation relationship between author and book
 */
public class BookService {
    public static void main() {
        Author author = new Author("xxxxx", "xxxxx");
        Book book = new Book(12344l, "xxxx", "xxxxx", author);
        author.getAuthorDetails();
        book.getBookDetails();
    }
}
