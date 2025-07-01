class Car {
    String brand;
    int speed;

    // Constructor with no parameters
    Car() {
        this.brand = "Unknown";
        this.speed = 0;
    }

    // Constructor with one parameter
    Car(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    // Constructor with two parameters
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void display() {
        System.out.println("Car Brand: " + brand + ", Speed: " + speed);
    }
}
    public class ConstructorInstance {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Toyota");
        Car car3 = new Car("Honda", 120);

        car1.display();
        car2.display();
        car3.display();
    }
}
