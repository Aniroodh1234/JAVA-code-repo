import java.util.Scanner;

public class Fibonacii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number sequence: ");
        int n = sc.nextInt();

        System.out.println("\nFibonacci sequence using recursion:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }

        System.out.println("\n\nFibonacci sequence using iteration:");
        fibonacciIterative(n);
    }

    // Recursive method to calculate Fibonacci numbers
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n; // Base cases: F(0) = 0, F(1) = 1
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative method to calculate Fibonacci numbers
    public static void fibonacciIterative(int n) {
        if (n <= 0) {
            System.out.println("Invalid input. Number of terms should be greater than 0.");
            return;
        }

        int first = 0, second = 1;
        System.out.print(first + " ");
        if (n > 1) {
            System.out.print(second + " ");
        }

        for (int i = 2; i < n; i++) {
            int next = first + second; 
            System.out.print(next + " ");
            first = second; 
            second = next;  
        }
    }
}
