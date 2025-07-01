class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
}

class Derived extends Base1{
    Derived(){
        System.out.println("I am a derived class constructor");
    }
    Derived(int y){
        super(5);
        System.out.println("I am an overloaded constructor of derived class with value of y as: " + y);
    }
}

class ChildOfDerived extends  Derived{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int z, int y){
        super(10);
        System.out.println("I am an overloaded constructor of child of derived class with value of z as: " + z);
    }
}
public class ConstructorInheritance {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1();
        ChildOfDerived cd = new ChildOfDerived(2,3);
    }
}