public class HelloApp {
    public static void main(String[] args) {
        // Handle the default scenario first
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            
            // Unconditionally append every name with a comma and space
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }
            
            // Chop off the trailing ", " using substring
            String finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);
            
            // Print the final, cleaned-up string
            System.out.println("Hello, " + finalNames + "!");
        }
    }
}
