import java.util.ArrayList;
import java.util.Scanner;

public class MethodOverloadingExample {

    static int multiply(int a, int b) {
        System.out.println("Method for Two numbers called-");
        return a * b;
    }

    static int multiply(int a, int b, int c) {
        System.out.println("Method for Three numbers called-");
        return a * b * c;
    }

    static int multiply(int[] numbers) {
        System.out.println("Method for multiple numbers called-");
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.print("Enter the number (Press * to stop): ");
            String input = scanner.next();
            if (input.equals("*")) {
                break;
            }
            try {
                numbers.add(Integer.parseInt(input));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number or '*' to stop.");
            }
        }
        int size = numbers.size();
        int result;
        if (size == 2) {
            result = multiply(numbers.get(0), numbers.get(1));
        } else if (size == 3) {
            result = multiply(numbers.get(0), numbers.get(1), numbers.get(2));
        } else if (size > 3) {
            int[] numArray = numbers.stream().mapToInt(i -> i).toArray();
            result = multiply(numArray);
        } else {
            System.out.println("Invalid input! You must enter at least two numbers.");
            return;
        }
        System.out.println("Result: " + result);

    }
}
