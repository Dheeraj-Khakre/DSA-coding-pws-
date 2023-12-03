/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TCS_NQT_Question;

/**
 *
 * @author hp
 */
public class BitTogled {

   
    public static void main(String[] args) {
        int num = 10; // Example input number
        
        int toggledNum = toggleBits(num);
        
        System.out.println("Toggled number: " + toggledNum);
    }
    
    public static int toggleBits(int num) {
        int toggledNum = 0;
        int bitPosition = 0;
        
        while (num > 0) {
            int bit = num & 1; // Extract the least significant bit
            
            if (bit == 0) {
                toggledNum += (1 << bitPosition); // Toggle the bit to 1
            }
            
            num >>= 1; // Right shift the number by 1 bit
            bitPosition++; // Increment the bit position
        }
        
        return toggledNum;
    }
}

}
