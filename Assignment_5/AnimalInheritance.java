class Animal{
    void eat(){
        System.out.println("Eating...");
    }
    void sleep(){
        System.out.println("Sleeping...");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("Walking...");
    }
    void run(){
        System.out.println("Running...");
    }
}
class dog extends Mammal{
    void bark(){
        System.out.println("Barking...");
    }
    void colour(){
        System.out.println("Colour is brown");
    }
}

public class AnimalInheritance{
    public static void main(String[] args){
        
        //mult level inheritence is performed
        
        dog d = new dog();
        d.eat();
        d.sleep();
        d.walk();
        d.run();
        d.bark();
        d.colour();
    }
}