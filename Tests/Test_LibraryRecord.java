public class Test_LibraryRecord {
    public static void main(String[] args){
        LibraryRecord myLR = new LibraryRecord("The art & science of Java", "Erics Roberts", 978, "PEARSON", 2008, true);
        LibraryRecord my5LR = new LibraryRecord("The art & science of Java", "Erics Roberts", 978, "PEARSON", 2008);
        System.out.println("The title of the book is: " + myLR.getTitle());
        System.out.println("The author of the book is: " + myLR.getAuthor());
        System.out.println("The catalog number of the book is: " + myLR.getCatalogNumber());
        System.out.println("The pubisher of the book is: " + myLR.getPublisher());
        System.out.println("The published year of the book is: " + myLR.getPublishYear());
        myLR.setNonCirculating();
        System.out.println("This book is circulating: " + myLR.getCirculating());
        System.out.println("The circulating status of the book my5LR is: " + my5LR.getCirculating());
        System.out.println("The name of the book is " + my5LR.toString());
    }
}
