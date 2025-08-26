import java.util.Scanner;

public class StringIndexdemo {
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length())); // Out of bounds
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.next();

        // Uncomment to see exception
        // generateException(input);

        handleException(input);
        sc.close();
    }
}
