class librarybook {
    private String title;
    private String author;
    private double price;
    private boolean available; 

   
    private static int totalBooks = 0;

    public librarybook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
        totalBooks++;
    }

    public void borrowbook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public static void showTotalbooks() {
        System.out.println("Total books in library: " + totalBooks);
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + 
                           ", Price: " + price + ", Available: " + available);
    }
}




