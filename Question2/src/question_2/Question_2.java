package question_2;

import java.util.Scanner;
public class Question_2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //prompt the user to enter a number for x
        System.out.println("Enter a number for x: ");
        double x = input.nextDouble();
        
        //prompt the user to enter a number for y
        System.out.println("Enter a number for y: ");
        double y = input.nextDouble();
        
        //prompt the user to enter a number for z
        System.out.println("Enter a number for z: ");
        double z = input.nextDouble();
        
        //give the result
        System.out.println(f(x,y,z));
    }
    
    
    //This method calculates the output
    static double f(double x, double y, double z){
        return (1/ Math.sqrt((Math.pow(x, 2) + Math.pow(y,2) + Math.pow(z, 2))-16));
    }
}
