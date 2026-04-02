public class HelloApp {

    public static void main(String[] args) {

        // Check if a name is provided
        if (args.length > 0 && !args[0].isEmpty()) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Default message
            System.out.println("Hello, World!");
        }
    }
}