import java.util.Scanner;

class CharFrequency {

    // Method to calculate frequency of characters
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; // frequency array for ASCII characters

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Count how many unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) uniqueCount++;
        }

        // Store results in 2D String array [char, frequency]
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = Integer.toString(freq[i]);
                index++;
            }
        }

        return result;
    }

    // Display result
    public static void display(String[][] result) {
        System.out.printf("%-10s %-10s\n", "Character", "Frequency");
        for (String[] row : result) {
            System.out.printf("%-10s %-10s\n", row[0], row[1]);
        }
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);
        display(result);
    }
}

