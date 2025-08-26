import java.util.Scanner;

public class FindFactor_convert_Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();
        int[] factors = findFactors(number);

        // Print the factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
    }

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int num) {
        int[] temp = new int[num]; // Temporary array to hold factors
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                temp[count++] = i; // Store factor in temporary array
            }
        }

        // Create a final array of the exact size
        int[] factors = new int[count];
        for (int i = 0; i < count; i++) {
            factors[i] = temp[i];
        }

        return factors;
    }
}
