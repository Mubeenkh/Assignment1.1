/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberconverter;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class NumberConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myInput = new Scanner(System.in);
        
        //Input:
        System.out.println("Please enter a 4-digits Octal Number: ");
        int octalNumber = myInput.nextInt();
        
        //Calculations        
        int P1 = octalNumber % 10;           //find modulo of octalNumber
            int Value1 = octalNumber / 10;
            
        int P2 = Value1 % 10;               //find the modulo of Value1
            int Value2 = Value1 / 10;
            
        int P3 = Value2 % 10;               //find the modulo of Value2
            int Value3 = Value2 / 10;
            
        int P4 = Value3 % 10;               //find the modulo of Value3
            int Value = P4;
        
        int decimalNumber =  P4 * (int)Math.pow(8,3) 
                                + P3 * (int)Math.pow(8, 2) 
                                     + P2 * (int)Math.pow(8, 1) 
                                         + P1 * (int)Math.pow(8, 0);
         
        //Output:
        System.out.printf("Octal Number   : %2s%n" ,  octalNumber);    
        System.out.printf("Decimal Number : %2s%n",  decimalNumber);  
    }
    
}
