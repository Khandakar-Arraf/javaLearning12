package examples;

public class ClassExample {
    // Variables
    String name;
    int age;

    // Constructor of ClassExample
    public ClassExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        ClassExample person = new ClassExample("Alice", 25);
        person.displayInfo();
    }
}