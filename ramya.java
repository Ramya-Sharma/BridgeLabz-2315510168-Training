import java.util.*;
public class ramya {
    public static int[] addOne(int[] dig) {
        int n = dig.length;
        
        
        for (int i = n - 1; i > 0; i--) {
            if (dig[i] < 9) {
                dig[i]++;  
                return dig;
            }
            dig[i] = 0;  
        }
        
        int[] newNum = new int[n + 1];
        newNum[0] = 1;  
        return newNum;
    }
    

    public static void main(String[] args) {
        int[] dig1 = {1, 2, 3};
        int[] dig2 = {9, 9, 8, 9};
    

        System.out.println(Arrays.toString(addOne(dig1)));
        System.out.println(Arrays.toString(addOne(dig2)));
    }
 }

    





    

