class circle {
    private double radius;

    public circle() {
        this(1.0); 
    }

    
    public circle(double radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
    }
}

