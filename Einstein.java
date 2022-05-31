import java.util.Scanner;

public class Einstein
{
    public static void main (String [] args)
    {
        //Constants
        final int PREDICTION = 1089;
        final int MIN_NUM = 99;
        final int MAX_NUM = 1000;
        final int HUNDREDS_IN_NUM = 100;
        final int TENS_IN_NUM = 10;
        int reversed_Number = 0;
        int different_Number = 0;
        int reversed_Different_Number = 0;
        
        //Welcome message
        System.out.println("Welcome to the einstein magic game.");
        
        //Gets the required number from the user
        Scanner scan = new Scanner (System.in);
        System.out.println ("Please enter a 3 digit" +
                " positive number whose first and last digits are different");
        int number = scan.nextInt();
        
        
        //Checks input's legality
        if (number <=MIN_NUM || number >= MAX_NUM)
        {
            System.out.println("The number you entered is not a 3 digit positive number");
        }
        else if (number / HUNDREDS_IN_NUM  == number % TENS_IN_NUM)
        {
            System.out.println("The  first  and  the  last  digits" + 
            " of  the  number  should  be different");

        }
        
        //Runs the program as required after the correct input
        else {
            
            System.out.println("User number is: " + number);
            
            //Calculate the constant variables to the required format
            reversed_Number += (number % TENS_IN_NUM) * HUNDREDS_IN_NUM;
            reversed_Number += (number / TENS_IN_NUM) % TENS_IN_NUM *
            TENS_IN_NUM;
            reversed_Number += number /HUNDREDS_IN_NUM;
        
            different_Number += Math.abs(reversed_Number - number);
        
            System.out.println("Difference: " + different_Number);
        
            reversed_Different_Number += (different_Number % TENS_IN_NUM)
            * HUNDREDS_IN_NUM;
            reversed_Different_Number += (different_Number / TENS_IN_NUM)
            % TENS_IN_NUM * TENS_IN_NUM;
            reversed_Different_Number += different_Number /HUNDREDS_IN_NUM;
        
            System.out.println("Reversed difference: " + 
            reversed_Different_Number);
            
            //checks and prints the result of the above calculation
             if (PREDICTION == reversed_Different_Number + different_Number)
            
                System.out.println("SUCCEEDED");
            
            
        
                else 
            
                    System.out.println("FAILED");
                
            
        }
        
           
        
        
        }
    }