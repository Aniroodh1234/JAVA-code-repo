import java.util.Scanner;

class Calculator{
    public int add(int a, int b){
        return a + b;
    }
    public int substract(int a, int b){
        return a - b;
    }
    public int multiply(int a, int b){
        return a * b;
    }
    public double divide(int a, int b){
        return (double) a / b;
    }

}
public class CalculatorMain{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Addition --> a + b = " + cal.add(a,b) + "\n");
        System.out.print("Substraction --> a - b = " + cal.substract(a,b) + "\n");
        System.out.print("Multiplication --> a * b = " + cal.multiply(a,b) + "\n");
        System.out.print("Division --> a / b = " + cal.divide(a,b) + "\n");
    }
}
