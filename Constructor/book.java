class book {
    
    private String title;
    private String author;
    private double price;

    
    public book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}