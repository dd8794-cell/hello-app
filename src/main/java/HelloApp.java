public class HelloApp {
    public static void main(String[] args) {
        // Check if the array actually has data in it first
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Fallback if the user forgets to type a name
            System.out.println("Hello, World!");
        }
    }
}
