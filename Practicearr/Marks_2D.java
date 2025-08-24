import java.util.Scanner;

public class Marks_2D {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        // 3 subjects for each student (Physics, Chemistry, Maths)
        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        String[] grades = new String[n];

        System.out.print("Enter total marks for each subject: ");
        int totalMarks = scanner.nextInt();
        int maxTotal = totalMarks * 3;

        // Input marks for all students
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            marks[i][0] = scanner.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = scanner.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = scanner.nextInt();

            // Calculate total and percentage
            int sum = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (double) sum / maxTotal * 100;

            // Assign grade
            if (percentages[i] >= 80) {
                grades[i] = "A (Above agency-normalized Standards)";
            } else if (percentages[i] >= 70) {
                grades[i] = "B (Agency-normalized Standards)";
            } else if (percentages[i] >= 60) {
                grades[i] = "C (Below, but approaching Standards)";
            } else if (percentages[i] >= 50) {
                grades[i] = "D (Well below Standards)";
            } else if (percentages[i] >= 40) {
                grades[i] = "E (Too below Standards)";
            } else {
                grades[i] = "F (Remedial Standards)";
            }
        }

        // Display results
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d: Percentage = %.2f%%, Grade = %s\n",
                    (i + 1), percentages[i], grades[i]);
        }

        // Compare percentages (find topper and lowest scorer)
        int topperIndex = 0, lowestIndex = 0;
        for (int i = 1; i < n; i++) {
            if (percentages[i] > percentages[topperIndex]) {
                topperIndex = i;
            }
            if (percentages[i] < percentages[lowestIndex]) {
                lowestIndex = i;
            }
        }

        System.out.println("\n--- Comparison ---");
        System.out.printf("Topper: Student %d with %.2f%% (%s)\n",
                (topperIndex + 1), percentages[topperIndex], grades[topperIndex]);
        System.out.printf("Lowest: Student %d with %.2f%% (%s)\n",
                (lowestIndex + 1), percentages[lowestIndex], grades[lowestIndex]);

        scanner.close();
    }
}
