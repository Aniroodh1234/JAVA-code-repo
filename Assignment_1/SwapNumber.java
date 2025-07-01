public class SwapNumber{
    public static void main(String[]args){
        //with using third variable
        int a = 20;
        int b = 30;
        // int temp;
        // System.out.print("Before Swapping: a = " + a + " b = " + b + "\n");
        // temp = a;
        // a = b;
        // b = temp;
        // System.out.print("After Swapping: a = " + a + " b = " + b + "\n");


        //without using third variable
        System.out.print("Before Swapping: a = " + a + " b = " + b + "\n");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print("After Swapping: a = " + a + " b = " + b + "\n");
    }
}