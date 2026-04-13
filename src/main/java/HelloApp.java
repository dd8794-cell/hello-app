/**
 * UC 5: Display multiple user names using an enhanced for loop.
 * If no names are provided, display "Hello, World!".
 *
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!"
 * - If no names are provided, it will display "Hello, World!"
 *
 * @author Developer Name
 * @version 5.0
 * @since UC1
 */

// Key Concepts for HelloApp UC5:
// 1. Command-Line Arguments: Accessing multiple user inputs via args[] parameter
// 2. Array Iteration: Using enhanced for loop to traverse all arguments
// 3. Enhanced For Loop: Simplifies iteration over arrays without manual index management
// 4. StringBuilder: Efficiently building a string in a loop
// 5. Default Values: Providing a fallback when no arguments are provided
// 6. String Concatenation: Building the final greeting message

public class HelloApp {
    public static void main(String[] args) {

        String name = "World";

        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            for (String n : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(n);
                first = false;
            }

            name = nameBuilder.toString();
        }

        System.out.println("Hello, " + name + "!");
    }
}