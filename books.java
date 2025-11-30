public class books {
    String title;
    String author;
    double price;

    public books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs " + price);
        System.out.println();
    }

    void showDetails(String title) {
        System.out.println("Book Title: " + title);
    }

    public static void main(String[] args) {
        books b1 = new books("Java Basics", "Herbert Schildt", 499.99);
        b1.showDetails();
        b1.showDetails(b1.title);
    }
}
