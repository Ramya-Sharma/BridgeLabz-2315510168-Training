import java.util.Scanner;

class UniqueCharacters {

    // Method to find string length without using length()
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) { // keep checking until exception
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // when index goes out of bound, stop
        }
        return count;
    }

    // Method to find unique characters
    public static char[] findUniqueChars(String text) {
        int n = getLength(text);
        char[] temp = new char[n]; // store unique characters
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            // check if already added before
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }

            // if unique, add to result array
            if (isUnique) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }

        // create exact sized array for unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    // Method to display result
    public static void display(char[] uniqueChars) {
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call methods
        char[] uniqueChars = findUniqueChars(text);

        // Display
        display(uniqueChars);
    }
}

