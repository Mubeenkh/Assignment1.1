/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalinfo;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class PersonalInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner myInput = new Scanner(System.in);
         
         //Input the values
         System.out.println("Please enter your name: ");
         String myName =  myInput.nextLine();
        
         System.out.println("Please enter your age: ");
         String myAge =   myInput.nextLine();
     
         System.out.println("Please enter your gender: ");
         String myGender = myInput.nextLine();
     
         System.out.println("Please enter your department: ");
         String myDepartment = myInput.nextLine();
        
         System.out.println("Please enter the value of PI (3.1415926): ");
         double valuePI = myInput.nextDouble();
        
        //Output the Answers
        System.out.printf("Name       : %2s%n" ,   myName );
        System.out.printf("Age        : %2s%n" ,  myAge  );    
        System.out.printf("Gender     : %2s%n" ,  myGender  );     
        System.out.printf("Department : %2s%n" , myDepartment );     
        System.out.printf("PI         : %2.2f%n" ,  valuePI );   
    }
    
}
