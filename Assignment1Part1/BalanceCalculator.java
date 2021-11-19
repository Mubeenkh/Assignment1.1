/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancecalculator;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Administrator
 */
public class BalanceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myInput = new Scanner(System.in);
        
        //Input of the basic info
        System.out.println( "Please enter the initial balance: "  );
        double Balance = myInput.nextDouble();                                      //Balance is for initial balance
        
        System.out.println( "Please enter the annual interest rate (2 for 2%): "  );
        double Interest = myInput.nextDouble();

        System.out.println( "Please enter the number of years the client wants to save money in the bank: " );
        int Years = myInput.nextInt();
        
        //Calculation to find the Balance after # years with annual interest
        double InterestDecimals = Interest / 100;                                   //Ex: turning 2.3% to 0.023
        double finalBalance = Balance * Math.pow( 1 + InterestDecimals , Years );       
         
        //Output Initial balance, Interest, and years of saving       
        System.out.printf( "Initial Balance       : %2.2f %n", Balance );
        System.out.printf( "Annual Interest Rate  : %2s%n", Interest + "%");
        System.out.printf( "Saving Years          : %2s%n", Years);
        System.out.println("------------------------------------- ");
        
        //Output Blanace after # of years
        System.out.printf("Balance After " + Years + " Years : %2.2f%n", + finalBalance);
    
    }
    
}
