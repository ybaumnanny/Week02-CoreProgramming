abstract class  Animal{
	protected String name;
	protected int age;
	
	public Animal(String name, int age){
		this.name = name;
		this.age = age ;
	}
	
	public abstract void makeSound();

    public void printInfo(){
        System.out.println("Name:- " + name + ", Age:- " + age);
    }
}
// subclass Dog created
class Dog extends Animal{
	public Dog(String name, int age) {
        super(name, age);
    }
    // Overriding makeSound() for Dog from Animal
    @Override
    public void makeSound() {
        System.out.println("Ginger says Woof Woof!");
    }
}
// subclass Cat created
class Cat extends Animal{
	public Cat(String name, int age) {
		super(name, age);
	}
	@Override
	public void makeSound(){
		System.out.println("Tom says Meow Meow!");
	}
}
// subclass Bird created
class Bird extends Animal{
	public Bird(String name, int age) {
		super(name, age);
	}
	@Override
	public void makeSound(){
		System.out.println("Looney says Chirp Chirp!");
	}
}

public class AnimalLife{
	public static void main(String[] args) {
		// Creating instances of Animal
		Dog dog = new Dog("Ginger", 5);
		Cat cat = new Cat("Tom", 4);
		Bird bird = new Bird("Looney", 6);

		System.out.println("Dog :");
		dog.printInfo();
		dog.makeSound();

		System.out.println("Cat :");
		cat.printInfo();
		cat.makeSound();

		System.out.println("Bird :");
		bird.printInfo();
		bird.makeSound();


	}
}


