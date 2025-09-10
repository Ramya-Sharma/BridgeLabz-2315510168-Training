public class Main {
    public static void main(String[] args) {
        // Book
        book b1 = new book();
        book b2 = new book("Java Basics", "James Gosling", 450.50);
        b1.display();
        b2.display();

        // Circle
        circle c1 = new circle();
        circle c2 = new circle(5.5);
        c1.display();
        c2.display();

        // Person
        person p1 = new person("Alice", 25);
        person p2 = new person(p1); // Copy constructor
        p1.display();
        p2.display();

        // HotelBooking
        booking h1 = new booking();
        booking h2 = new booking("John", "Deluxe", 3);
        booking h3 = new booking(h2);
        h1.display();
        h2.display();
        h3.display();

        // LibraryBook
        librarybook lb1 = new librarybook("1984", "George Orwell", 250, true);
        librarybook lb2 = new librarybook("The Alchemist", "Paulo Coelho", 300, true);
        lb1.display();
        lb2.display();
        lb1.borrowbook();
        lb1.borrowbook();
        librarybook.showTotalbooks();

        // CarRental
        rent cr1 = new rent();
        rent cr2 = new rent("David", "Toyota", 5);
        cr1.display();
        cr2.display();
    }
}

