import java.util.Scanner;

class BMICalculator {

    
    public static void calculateBMI(double[][] members) {
        for (int i = 0; i < members.length; i++) {
            double weight = members[i][0];
            double heightM = members[i][1] / 100; 
            double bmi = weight / (heightM * heightM);
            members[i][2] = bmi; 
        }
    }

  
    public static String[] getBMIStatus(double[][] members) {
        String[] status = new String[members.length];
        for (int i = 0; i < members.length; i++) {
            double bmi = members[i][2];
            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 25) status[i] = "Normal";
            else if (bmi < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        return status;
    }

    public static void display(double[][] members, String[] status) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < members.length; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", 
                              members[i][0], members[i][1], members[i][2], status[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] members = new double[10][3]; 

        for (int i = 0; i < members.length; i++) {
            System.out.println("Enter details for person " + (i + 1));
            System.out.print("Weight (kg): ");
            members[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            members[i][1] = sc.nextDouble();
        }

        calculateBMI(members);
        String[] status = getBMIStatus(members);
        display(members, status);
    }
}

