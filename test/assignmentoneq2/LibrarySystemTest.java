/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package assignmentoneq2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Kuhle Langa
 */
public class LibrarySystemTest {
    
    public LibrarySystemTest() {
    }
     private LibrarySystem librarySystem;

    @Before
    public void setUp() {
        librarySystem = new LibrarySystem();
    }

    @Test
    public void testAddBook() {
        librarySystem.addBook("Test Book", "Test Author", 2022);
        assertEquals("Book", librarySystem.libraryCatalog[0].getType());
        assertEquals("Test Book", librarySystem.libraryCatalog[0].getTitle());
    }

    @Test
    public void testAddMagazine() {
        librarySystem.addMagazine("Test Magazine", "Test Publisher", 2022);
        assertEquals("Magazine", librarySystem.libraryCatalog[0].getType());
        assertEquals("Test Magazine", librarySystem.libraryCatalog[0].getTitle());
    }
  
}
