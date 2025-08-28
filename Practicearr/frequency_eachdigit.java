

import java.util.Scanner;

public class frequency_eachdigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Handle negative numbers
        number = Math.abs(number);

        // Step 2: Convert number to string to easily extract digits
        String numStr = Long.toString(number);
        int length = numStr.length();

        // Step 3: Store digits in an array
        int[] digits = new int[length];
        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0'; // convert char to int
        }

        // Step 4: Frequency array for digits 0-9
        int[] frequency = new int[10];
        for (int digit : digits) {
            frequency[digit]++;
        }

        // Step 5: Display frequency
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) { // show only digits that appear
                System.out.println("Digit " + i + " => " + frequency[i] + " times");
            }
        }

        scanner.close();
    }
}


