class Dec2Hex {
    public static void main(String args[]) {
        // Check if an argument has been provided
        if (args.length == 0) {
            System.out.println("Error: No input provided. Please enter an integer as an argument.");
            return; // Exit the program if no input is provided
        }

        try {
            // Try to parse the first argument as an integer
            int num = Integer.parseInt(args[0]);

            // Array representing hexadecimal characters from 0 to F
            char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            int rem;           // To store the remainder when dividing by 16
            String hexadecimal = ""; // To build the resulting hexadecimal string

            // Inform the user that the conversion process is starting
            System.out.println("Converting the Decimal Value " + num + " to Hex...");

            // Loop until the entire number is converted
            while (num != 0) {
                // Calculate remainder when num is divided by 16
                rem = num % 16;

                // Prepend the corresponding hex character for the remainder to the result string
                hexadecimal = ch[rem] + hexadecimal;

                // Update num by dividing it by 16 (move to the next hex digit position)
                num = num / 16;
            }

            // Print the final hexadecimal representation
            System.out.println("Hexadecimal representation is: " + hexadecimal);

        } catch (NumberFormatException e) {
            // Handle cases where the input is not a valid integer
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        }
    }
}

