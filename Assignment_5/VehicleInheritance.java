class Vehicle{
    void model(){
        System.out.println("Vehicle model is LM00123");
    }
    void year(){
        System.out.println("Vehicle year is 2021");
    }

}
class Car extends Vehicle{
    void fuelType(){
        System.out.println("Car fuel type is petrol");
    }
    void numDoors(){
        System.out.println("Car has 4 doors");
    }
}

public class VehicleInheritance{
    public static void main(String[]args){
        Car c = new Car();
        c.model();
        c.year();
        c.fuelType();
        c.numDoors();
    }
}