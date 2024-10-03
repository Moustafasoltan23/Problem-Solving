import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            int value = scanner.nextInt();
            if (value == 0) {
                System.out.print(0 + " ");
                continue;
            }
            // This StringBuilder will help accumulate the digits.
            StringBuilder output = new StringBuilder();
            while (value != 0) {
                int mynum = value % 10;
                output.insert(0, mynum + " "); // Insert at the beginning to maintain order
                value /= 10;
            }
            System.out.print(output.toString().trim() + " "); // Print the result for the current number
        }
        scanner.close(); // Close the scanner
    }
}
