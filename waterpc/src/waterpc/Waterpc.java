/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterpc;

import java.util.Scanner;

public class Waterpc {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code app  Scanner keyedInput = new Scanner(System.in);
         Scanner keyedInput = new Scanner(System.in);
        
        //Variables and constants are stated
        final double WATER_USED = 1.5;
        double waterWasted;
        int combos; 
        
        //What user will see 
        System.out.println("Please enter how many monitors you have at home here:");
        combos = keyedInput.nextInt();
        
        //Calculations to get water used
        waterWasted = combos * WATER_USED;
        
        System.out.println("Oh No! You have wasted "+waterWasted+" tones of water!");
    }
    
}
