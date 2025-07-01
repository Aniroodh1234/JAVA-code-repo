import java.util.Arrays;

public class MinProduct {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 1};
        int minProduct = findMinProduct(arr);
        System.out.println("Output: " + minProduct);
    }

    public static int findMinProduct(int[] arr) {
        Arrays.sort(arr);
        return arr[0] * arr[1];
    }
}
