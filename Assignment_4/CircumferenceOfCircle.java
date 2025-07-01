import java.util.Scanner;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }

}
    public class CircumferenceOfCircle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        sc.close();

        Circle c = new Circle(r);
        System.out.printf("Area: %.2f\n", c.getArea());
        System.out.printf("Circumference: %.2f\n", c.getCircumference());
    }
}
