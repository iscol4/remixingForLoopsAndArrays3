/*
Isaac Collier
March 24 2020
This program uses arrays and loops to calculate marks.
 */
package remixingforloopsandarrays3;

/**
 *
 * @author Isaac
 * This class is teaching me bout arrays and how to use them to make repeated code quicker.
 */
import java.util.Scanner;
public class RemixingForLoopsAndArrays3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner keyedInput = new Scanner (System.in);
      
        //creates array:
        double [ ] marks = {34.7, 54.1, 34.8, 99.6, 43.6, 43.2, 65.8, 44.8, 88.6};
    
        //declares variables:
        double total=0;
        double average;
        
        //loop that displays all marks to user:
        System.out.println("These are the marks:");
        for (int i = 0; i<=8; i= i + 1)
        {
           System.out.println(marks[i]);
        }
        
        //Loop that adds all marks to a total:
        for (int i = 0; i<=8; i= i + 1)
        {
            total = total + marks[i];
        }
        
        //finds average of marks:
        average = total/9;
        
        //rounds average to one decimal place:
        average = average * 10;
        average = Math.round(average);
        average = average/10;
        
        //displays average to user:
        System.out.println("The average mark is:");
        System.out.println(average);
    }
    
}
