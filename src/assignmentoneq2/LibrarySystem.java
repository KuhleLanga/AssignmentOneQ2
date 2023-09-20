/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentoneq2;

import java.util.Scanner;

/**
 *
 * @author Kuhle Langa
 */
public class LibrarySystem {
    private static LibraryItem[] libraryCatalog = new LibraryItem[50];
    private static int itemCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Library System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. List Library Items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    addMagazine(scanner);
                    break;
                case 3:
                    listLibraryItems();
                    break;
                case 4:
                    System.out.println("Exiting Library System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addBook(Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter publication year: ");
        int publicationYear = scanner.nextInt();

        libraryCatalog[itemCount] = new Book(title, author, publicationYear);
        itemCount++;

        System.out.println("Book added to the library.");
    }

    private static void addMagazine(Scanner scanner) {
        System.out.print("Enter magazine title: ");
        String title = scanner.nextLine();
        System.out.print("Enter publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Enter publication year: ");
        int publicationYear = scanner.nextInt();

        libraryCatalog[itemCount] = new Magazine(title, publisher, publicationYear);
        itemCount++;

        System.out.println("Magazine added to the library.");
    }

    private static void listLibraryItems() {
        System.out.println("Library Catalog:");
        for (int i = 0; i < itemCount; i++) {
            LibraryItem item = libraryCatalog[i];
            System.out.println("Type: " + item.getType());
            System.out.println("Title: " + item.getTitle());
            System.out.println("Publication Year: " + item.getPublicationYear());

            if (item instanceof Book) {
                Book book = (Book) item;
                System.out.println("Author: " + book.getAuthor());
            } else if (item instanceof Magazine) {
                Magazine magazine = (Magazine) item;
                System.out.println("Publisher: " + magazine.getPublisher());
            }

            System.out.println();
        }
    }
}
