class Person {
    String name;
    int age;
    // Constructor 
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Copy constructor 
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
    // print method
    public void print() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class PersonInfo{
    public static void main(String[] args) {
        // Creating a Person object
        Person person1 = new Person("John", 30);
        // calling copy constructer
        Person person2 = new Person(person1);
        // print info
        System.out.println("Original Person:");
        person1.print();
        
        System.out.println("Cloned Person:");
        person2.print();
    }
}
