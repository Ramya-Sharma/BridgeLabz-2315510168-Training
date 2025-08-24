package Practicearr;

import java.util.Scanner;

public class Marks_percentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks obtained in physics: ");
        int marks1 = scanner.nextInt();
        System.out.print("Enter marks obtained in Maths: ");
        int marks2 = scanner.nextInt();
        System.out.print("Enter marks obtained in Chemistry: ");
        int marks3 = scanner.nextInt();
        System.out.print("Enter total marks: ");
        int totalMarks = scanner.nextInt();
        double percentage = 0.0;
        int[] marks = {marks1, marks2, marks3};
        if (marks[0] < 0 || marks[1] < 0 || marks[2] < 0) {
            System.out.println("Invalid marks entered.");
        } else {
            percentage = (double) (marks[0] + marks[1] + marks[2]) / totalMarks * 100;
            System.out.println("Percentage: " + percentage + "%");
        }
        if( percentage <=80){
            System.out.println("above agency-normalized Standards");
        }
        else if( 70 < percentage && percentage < 79){
            System.out.println("agency-normalized Standards");
            }
        else if( 60 < percentage && percentage < 69){
            System.out.println("below , but approaching agency-normalized Standards");
            }
        if( 50 < percentage && percentage < 59){
            System.out.println(" well below agency-normalized Standards");
            }
        else if( 50 < percentage && percentage < 59){
            System.out.println(" well below agency-normalized Standards");
            }
        else if( 40 < percentage && percentage < 49){
            System.out.println("too below agency-normalized Standards");
            }
        else if(percentage <= 39){
            System.out.println("Remedial Standards");
        }
        
        // double percentage = (double) marks / totalMarks * 100;
        // System.out.println("Percentage: " + percentage + "%");
    }
}