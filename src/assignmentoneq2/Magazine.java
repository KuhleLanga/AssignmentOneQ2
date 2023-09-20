/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentoneq2;

/**
 *
 * @author Kuhle Langa
 */
public class Magazine extends LibraryItem {
     private String publisher;

    public Magazine(String title, String publisher, int publicationYear) {
        super(title, publicationYear);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String getType() {
        return "Magazine";
    }
}
