public class HelloApp {
    public static void main(String[] args) {
        // Check if we have at least one argument
        if (args.length > 0) {
            StringBuilder names = new StringBuilder();
            
            // Loop through the array of arguments
            for (int i = 0; i < args.length; i++) {
                names.append(args[i]);
                
                // Add a comma and space if it's NOT the last name in the list
                if (i < args.length - 1) {
                    names.append(", ");
                }
            }
            // Print the final, assembled string
            System.out.println("Hello, " + names.toString() + "!");
            
        } else {
            // Fallback if no arguments are provided
            System.out.println("Hello, World!");
        }
    }
}
