class person {
    private String name;
    private int age;


    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public person(person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}