public class SizeOfPrimitiveDatatypes{
    public static void main(String[]args){
        System.out.print("Size of byte: " + Byte.SIZE/8 + " bytes\n"); ///here we get size in bits hence we have divide it with 8
        System.out.print("Size of short: " + Short.SIZE/8 + " bytes\n");
        System.out.print("Size of int: " + Integer.SIZE/8 + " bytes\n");
        System.out.print("Size of long: " + Long.SIZE/8 + " bytes\n");
        System.out.print("Size of float: " + Float.SIZE/8 + " bytes\n");
        System.out.print("Size of double: " + Double.SIZE/8 + " bytes\n");
        System.out.print("Size of char: " + Character.SIZE/8 + " bytes\n");
    }
}