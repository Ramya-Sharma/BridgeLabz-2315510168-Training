import java.util.Scanner;

class FrequencyWithUnique {

    // Method to find unique characters in a string
    public static char[] findUniqueChars(String text) {
        int n = text.length();
        char[] temp = new char[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            // check if already appeared before
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }

        // Create exact sized array
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    // Method to calculate frequency using unique characters
    public static String[][] findFrequency(String text) {
        char[] uniqueChars = findUniqueChars(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            int count = 0;

            // count occurrences
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == ch) {
                    count++;
                }
            }

            result[i][0] = Character.toString(ch);
            result[i][1] = Integer.toString(count);
        }
        return result;
    }

    // Method to display results
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
