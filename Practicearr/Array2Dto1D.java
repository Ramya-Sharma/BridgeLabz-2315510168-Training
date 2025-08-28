package Practicearr;

public class Array2Dto1D {
     public static void main(String[] args) {
        int[][] twoDArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Convert 2D array to 1D array
        int[] oneDArray = new int[twoDArray.length * twoDArray[0].length];
        int index = 0;
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                oneDArray[index++] = twoDArray[i][j];
            }
        }

        // Print the 1D array
        System.out.println("1D Array:");
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.print(oneDArray[i] + " ");
        }
    }
    
}
