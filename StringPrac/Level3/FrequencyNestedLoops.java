import java.util.Scanner;

class FrequencyNestedLoops {

    // Method to find frequency using nested loops
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int n = chars.length;

        String[] result = new String[n]; // store "char = frequency"

        for (int i = 0; i < n; i++) {
            if (chars[i] == '0') continue; // already counted

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    chars[j] = '0'; // mark duplicate
                }
            }

            result[i] = chars[i] + " = " + count;
        }
        return result;
    }

    // Method to display result
    public static void display(String[] result) {
        System.out.println("Character  Frequency");
        for (String s : result) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] result = findFrequency(text);
        display(result);
    }
}

