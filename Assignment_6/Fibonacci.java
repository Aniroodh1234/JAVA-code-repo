// import java.util.Scanner;

// public class Fibonacci {
//     public static void main(String[] args) {
//         Scanner Sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = Sc.nextInt();

//         int a = 1, b = 1;
//         for(int i = 2; i <= n; i++){
//             b = a + b;
//             a = b;

//         }
        
//         System.out.print(1 + " "+ 1 + " " + a + b + " ");
//     }
// }


import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of terms: ");
            int n = sc.nextInt();
            
            int a = 1, b = 1;
            System.out.print("Fibonacci Series: " + a + " " + b + " ");
            
            for (int i = 2; i < n; i++) {
                int next = a + b;
                System.out.print(next + " ");
                a = b;
                b = next;
            }
        }
    }
}
