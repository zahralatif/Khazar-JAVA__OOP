package DataStructure;

import java.util.Arrays;

public class ReverseArray {
    
    public static void main(String[] args) {
        int[] ascii_code = {
            90, 97, 104, 114, 97};
        
        System.out.println("Original array of ASCII Code : " + Arrays.toString(ascii_code));  
        
        for (int i = 0; i < ascii_code.length / 2; i++) {
            // Swap the elements at positions 'i' and 'length - i - 1'.
            int temp = ascii_code[i];
            ascii_code[i] = ascii_code[ascii_code.length - i - 1];
            ascii_code[ascii_code.length - i - 1] = temp;
        }
        
        System.out.println("Reverse array of ASCII Code : " + Arrays.toString(ascii_code));
    }
}

