/**
 * Based on the Student class, create a class LibraryRecord to keep the following book's info:
 * The title, The author, The Library of Congress catalog number, The publisher, The year of publication, Whether the book is circulating or non circulating
 * The LibraryRecord class should export the following info:
 * 1. A Constructor that takes all six of the value and create a new LibraryRecord object with them
 * 2. A Second version of constructor that take only first 5 values and initialize the book to be circulating
 * 3. Suitably named getter method for each of the six field
 * 4. A Setter method for circulating/ non-circulating flag
 * 5. An appropriate implementation of the toString method
 */
public class LibraryRecord {
    public LibraryRecord(String title, String author, int catalogNumber, String publisher, int publishYear, boolean circulating){
        bookTitle = title;
        bookAuthor = author;
        bookCatalogNumber = catalogNumber;
        bookPublisher = publisher;
        bookPublishYear = publishYear;
        bookCirculating = circulating;
    }
    public LibraryRecord(String title, String author, int catalogNumber, String publisher, int publishYear){
        bookTitle = title;
        bookAuthor = author;
        bookCatalogNumber = catalogNumber;
        bookPublisher = publisher;
        bookPublishYear = publishYear;
        this.bookCirculating = true;
    }
    public String getTitle(){
        return bookTitle;
    }
    public String getAuthor(){
        return bookAuthor;
    }
    public int getCatalogNumber(){
        return bookCatalogNumber;
    }
    public String getPublisher(){
        return bookPublisher;
    }
    public int getPublishYear(){
        return bookPublishYear;
    }
    public boolean getCirculating(){
        return bookCirculating;
    }
    public void setCirculating(){
        this.bookCirculating = true;
    }
    public void setNonCirculating(){
        this.bookCirculating = false;
    }
    public String toString(){
        return "Title = " + bookTitle + "\t Author = " + bookAuthor + "\t Catalog Number = " + bookCatalogNumber + "\t Publisher = " + bookPublisher + "\t Publish year " + bookPublishYear + "\t Circulating  = " + bookCirculating;
    }
    private String bookTitle;
    private String bookAuthor;
    private int bookCatalogNumber;
    private String bookPublisher;
    private int bookPublishYear;
    private boolean bookCirculating;
}
