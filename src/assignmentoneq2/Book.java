/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentoneq2;

/**
 *
 * @author Kuhle Langa
 */
public class Book extends LibraryItem {
     private String author;

    public Book(String title, String author, int publicationYear) {
        super(title, publicationYear);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String getType() {
        return "Book";
    }
}
