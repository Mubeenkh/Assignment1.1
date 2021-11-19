/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pricecalculator;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class PriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner myInput = new Scanner(System.in);

        System.out.println("Please enter the item price: ");
        double Price = myInput.nextDouble();

        System.out.println("Please enter the discount ratio (5 of 5%): ");
        double P_D_R = myInput.nextDouble(); // P_D_R means Percentage Discount Ratio
        
        //calculation part
        double P_to_D = P_D_R / 100;  //converting 5% to 0.05, P for Percentage and D for Decimal 
        double discountRatio = Price * P_to_D;
        double discountPrice = Price - discountRatio;   //calculation to find the  price of the item with the 5% discount
      
        //Output the iten price, discount ratio, and price with 5% discount        
        System.out.printf("Original Price   : %2s %n" , Price);
        System.out.printf("Discount Ratio   : %2s %n" , P_D_R + "%");
        System.out.printf("Price Before Tax : %2.2f %n" ,discountPrice);
        
        System.out.println( "---------------------------" );
        
        //calculations with tax        
        final double F_Tax = 0.95; //F for Federal
        final double P_Tax = 1.85; //P for Provincial         
        double finalPrice = discountPrice + F_Tax + P_Tax ;
        
        //Output tax and final price
        System.out.printf("Federal Tax      : %3s %n" , F_Tax);        
        System.out.printf("Provicial Tax    : %2s %n" ,  P_Tax);   
        System.out.printf("Final Price      : %2.2f %n" , finalPrice );
    }
    
}
