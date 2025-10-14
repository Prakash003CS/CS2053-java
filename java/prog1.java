class Book {
    String title;
    String author;
    double price;

    Book() {
        this("Unknown Title", "Unknown Author", 0.0);     }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println(" Title: " + this.title);
        System.out.println(" Author: " + this.author);
        System.out.println(" Price: $" + this.price);
    }
}

public class prog1 {
    public static void main(String[] args) {
        Book book1 = new Book("Harry", "Jhon", 70);  
        Book book2 = new Book("The 2000", "Mark", 43);
        Book book3 = new Book("The Alchemist", "Paulo", 50);

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}
