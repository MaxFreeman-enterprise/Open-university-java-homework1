import java.util.Scanner;

public class Milliseconds
{
    public static void main (String [] args)
    {
    //Constants    
    final int MS_IN_SEC = 1000;
    final int SEC_IN_MIN = 60;
    final int MIN_IN_HOURS = 60;
    final int HOURS_IN_DAY = 24;    
        
    Scanner scan = new Scanner (System.in);
    //Welcome message
    System.out.println ("This program reads an integer which " +
        "represents Milliseconds and converts it to days, " +
        "hours,  minutes and seconds. ");
        System.out.println ("Please enter the number of Milliseconds");
    
    //receiving int number from user 
    long ms = scan.nextLong();
    
    //Calculate the variables to the required format
    long seconds = ms / MS_IN_SEC;
    long minutes = seconds / SEC_IN_MIN;
    long hours = minutes / MIN_IN_HOURS;
    long days = hours / HOURS_IN_DAY;
    
    //converting the calculation of the above to the required format
    String time = days + " days " + hours % HOURS_IN_DAY + ":" + minutes % MIN_IN_HOURS + ":" + seconds % SEC_IN_MIN + " hours"; 
    
    //printing the result:
    System.out.println(time);
    
        
    }
}
