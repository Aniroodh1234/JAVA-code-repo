public class Loader {
    public static void main(String[] args) throws InterruptedException {
        String chars = "01";
        System.out.println("Initiating process");
        Thread.sleep(2000);
        
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 50; j++) {
                System.out.print(chars.charAt((int)(Math.random() * chars.length())));
            }
            System.out.println();
            Thread.sleep(100);
        }
        System.out.println("\nGot it!! Thanks for sharing details..");
    }
}