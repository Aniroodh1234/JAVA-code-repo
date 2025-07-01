import java.util.Scanner;

public class Checking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;

        // Calculate the sum of digits
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        System.out.println("Sum of the digits is: " + sum);

        // Check if the sum is a prime number
        if (isPrime(sum)) {
            System.out.println("sum is a prime number.");
        } else {
            System.out.println("sum is not a prime number.");
        }

        // Check if the sum is a perfect number
        if (isPerfect(sum)) {
            System.out.println("sum is a perfect number.");
        } else {
            System.out.println("sum is not a perfect number.");
        }

        // Check if the sum is an Armstrong number
        if (isArmstrong(sum)) {
            System.out.println("sum Armstrong number.");
        } else {
            System.out.println(" sum is not an Armstrong number.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPerfect(int num) {
        if (num <= 0) {
            return false;
        }

        int sumOfDivisors = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors == num;
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int numberOfDigits = String.valueOf(num).length();
        int armstrongSum = 0;

        while (num > 0) {
            int digit = num % 10;
            armstrongSum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        return armstrongSum == originalNum;
    }
}
