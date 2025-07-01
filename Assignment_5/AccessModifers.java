class Animal {
    protected String name;
    public Animal() {
        this.name = "Unknown Animal";
        System.out.println("Animal constructor called");
    }
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called with name: " + name);
    }
    protected void display() {
        System.out.println("Animal Name: " + name);
    }
}
class Mammal extends Animal {
    protected int legs;
    public Mammal() {
        super(); 
        this.legs = 4;
        System.out.println("Mammal constructor called");
    }
    public Mammal(String name, int legs) {
        super(name); 
        this.legs = legs;
        System.out.println("Mammal constructor called with legs: " + legs);
    }
    protected void showMammalDetails() {
        display();
        System.out.println("Number of Legs: " + legs);
    }
}
class Dog extends Mammal {
    private String breed;
    public Dog() {
        super(); 
        this.breed = "Unknown";
        System.out.println("Dog constructor called");
    }
    public Dog(String name, int legs, String breed) {
        super(name, legs);
        this.breed = breed;
        System.out.println("Dog constructor called with breed: " + breed);
    }
    public void showDogDetails() {
        showMammalDetails(); 
        System.out.println("Breed: " + breed);
    }
}

public class AccessModifers {
    public static void main(String[] args) {
        System.out.println("Default Constructors on display\n");
        Dog dog1 = new Dog();
        dog1.showDogDetails();

        System.out.println("\nParameterized Constructors on display\n");
        Dog dog2 = new Dog("Buddy", 4, "Golden Retriever");
        dog2.showDogDetails();
    }
}