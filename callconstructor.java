// Example: Using this() to call another constructor
class Student {
    String name;
    int age;
    String course;

    // Constructor 1
    Student() {
        // calling parameterized constructor using this()
        this("Unknown", 0, "Not Assigned");
        System.out.println("Default constructor called");
    }

    // Constructor 2
    Student(String name, int age) {
        // calling 3-argument constructor using this()
        this(name, age, "General");
        System.out.println("Two-argument constructor called");
    }
 // Constructor 3
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Three-argument constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}

