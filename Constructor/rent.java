class rent {
    private String customerName;
    private String carModel;
    private int rentalDays;

  
    private static final double RATE_PER_DAY = 1000.0; 

    public rent() {
        this("Unknown", "Generic Car", 1);
    }

    public rent(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * RATE_PER_DAY;
    }

    public void display() {
        System.out.println("Customer: " + customerName + 
                           ", Car: " + carModel + 
                           ", Days: " + rentalDays + 
                           ", Total Cost: " + calculateTotalCost());
    }
}


