import java.util.*;

public class ques10level1{
    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer!");
            return;
        }

        // Create a String array to store results
        String[] results = new String[n + 1];

        // Loop from 0 to n and save values
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                results[i] = "0";  // Special case for 0
            } else if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Print results with index positions
        for (int i = 1; i <= n; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
