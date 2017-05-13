/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacalculator;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class AreaCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);
        int userInput, base, height, length, width, radius, sLength;
        
        System.out.print("1) Triangle\n" + "2) Rectangle\n" + "3) Square\n" + "4) Circle\n" + "5) Quit\n" + "Which shape: ");
        userInput = ky.nextInt();
        
        
        while(userInput != 5){
        
            if(userInput == 1){
            
                System.out.print("Base: ");
                base = ky.nextInt();
                System.out.print("Height: ");
                height = ky.nextInt();  
                System.out.println( "The area is " + area_triangle(base, height) + "\n");
                
                System.out.print("1) Triangle\n" + "2) Rectangle\n" + "3) Square\n" + "4) Circle\n" + "5) Quit\n" + "Which shape: ");
                userInput = ky.nextInt();
            
            }else if(userInput == 2){
            
                System.out.print("Length: ");
                length = ky.nextInt();
                System.out.print("Width: ");
                width = ky.nextInt();   
                System.out.println( "The area is " + area_rectangle(length, width) + "\n");
                
                System.out.print("1) Triangle\n" + "2) Rectangle\n" + "3) Square\n" + "4) Circle\n" + "5) Quit\n" + "Which shape: ");
                userInput = ky.nextInt();
                
            }else if(userInput == 3){
            
                System.out.print("Side length: ");
                sLength = ky.nextInt();
                System.out.println( "The area is " + area_square(sLength) + "\n");
                
                System.out.print("1) Triangle\n" + "2) Rectangle\n" + "3) Square\n" + "4) Circle\n" + "5) Quit\n" + "Which shape: ");
                userInput = ky.nextInt();
            
            }else if(userInput == 4){
            
                System.out.print("Radius: ");
                radius = ky.nextInt();
                System.out.println( "The area is " + area_circle(radius) + "\n");
                
                System.out.print("1) Triangle\n" + "2) Rectangle\n" + "3) Square\n" + "4) Circle\n" + "5) Quit\n" + "Which shape: ");
                userInput = ky.nextInt();
            
            }else{
            
                userInput = 5;
            }
        }
    
    
    
    
    }
    
   
    public static double area_circle( int radius ){
   
        return   Math.PI * (radius * radius) ;
    }        
    
    

    public static double area_triangle( int base, int height ){
    
        return 0.5 * (base * height);
    }
    
    
    public static int area_rectangle( int length, int width ){
    
        return length * width;
    }

    public static int area_square( int side ){
    
        return side * side;
    }

    



}
