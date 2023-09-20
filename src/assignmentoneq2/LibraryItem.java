/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentoneq2;

/**
 *
 * @author Kuhle Langa
 */
public class LibraryItem extends AssignmentOneQ2 {
    private String title;
    private int publicationYear;

    public LibraryItem(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getType() {
        return "Library Item";
    }
}
