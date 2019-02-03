package fourinteger;

/**
 * Class   CSC113
 * @author Davindra O'Neal
 * Purpose of Program Graded Exercise - To Calculate The Product of Four Integers
 */
import java.util.Scanner; //This imports the Scanner utility which allows us to accept inputs
public class FourInteger {
    //This is a Graded Exercise
    //This program finds the product of four integers and displays the result
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// creates a Scanner object and assigns its reference to the variable input
        
        System.out.println("Enter the first number");
        int firstnumber = input.nextInt();// this declaration makes whatever the user enters is saved as the variable first number
        System.out.println("The number you've typed is " + firstnumber );
        System.out.println("Enter the second number");
        int secondnumber = input.nextInt();
        System.out.println("The number you've typed is " + secondnumber);
        System.out.println("Enter the third number");
        int thirdnumber = input.nextInt();
        System.out.println("The number you've typed is " + thirdnumber);
        System.out.println("Enter the fourth number");
        int fourthnumber = input.nextInt();
        System.out.println("The number you've typed is" + fourthnumber);
        System.out.println("The product of these four numbers is " + firstnumber*secondnumber*thirdnumber*fourthnumber);
                
         

                

               
    }
    
}
