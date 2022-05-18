/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays.pkg1;
import java.util.*;


/**
 *
 * @author User
 */
public class Arrays1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]  numbers=  new int[5];
       // int i;
       System.out.print("Enter a number:");
       Scanner kbd=  new Scanner(System.in);
       int num=kbd.nextInt();
      //int num=0;
        if(num>0&num<5){
            System.out.println("Number valid");
           num++;}
        else{
                       System.out.print("Number invalid");    
                }
  
    }
    
}
