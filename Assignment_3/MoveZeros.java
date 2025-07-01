
public class MoveZeros {
    public static void main(String[] args) {
        String input = "110247745080";
        String output = moveZerosToEnd(input);
        System.out.println("Output: " + output);
    }

    public static String moveZerosToEnd(String num) {
        StringBuilder nonZeroPart = new StringBuilder();
        int zeroCount = 0;

        for (char ch : num.toCharArray()) {
            if (ch == '0') {
                zeroCount++;
            } else {
                nonZeroPart.append(ch);
            }
        }

        // Append the zeros at the end
        while (zeroCount-- > 0) {
            nonZeroPart.append('0');
        }

        return nonZeroPart.toString();
    }
}
