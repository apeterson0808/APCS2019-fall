//Alice Peterson
//October 28, 2019
//Fractional Calculator
package fracCalc;
import java.util.*;
public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	//Receives input and has while loop to quit 
    	Scanner input = new Scanner(System.in);
        String expression = input.nextLine();
        while(!expression.equals("quit")) {
        	 System.out.println(produceAnswer(expression));
        	 String expression2 = input.nextLine();
        }
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"

    public static String produceAnswer(String input)
    { 
    	//Stored values in arrays
    	String[] val1 = {"0","0","1"};
    	String[] val2 = {"0","0","1"};
    	
    	//Splitting whole expression to only second value
    	String[] splitEx = input.split(" ");
    	//Splitting if mixed number7	
    	if(splitEx[2].contains("_")) {
    		String[] splitVal2 = splitEx[2].split("_");
    		String[] splitFrac = splitVal2[1].split("/");
    		val2[0]= splitVal2[0];
    		val2[1]= splitFrac[0];
    		val2[2]= splitFrac[1];
    		}
    	//Splitting if just fraction
    	else if(splitEx[2].contains("/")) {
    		String[] splitFrac = splitEx[2].split("/");
    		val2[1]= splitFrac[0];
    		val2[2]= splitFrac[1];}
    	//Splitting if just whole number
    	else {
    		val2[0]= splitEx[2];
    	}
    	return "whole:"+val2[0]+" numerator:"+val2[1]+" denominator:"+val2[2];
    }
 }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
