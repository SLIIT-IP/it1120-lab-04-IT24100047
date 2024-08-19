import java.util.Scanner;
public class IT100047Lab4Q1
{
    public static void main (String [] args ) 
	{
	   // define data type of variable
	      int input ;
		  
       // making scanner object 
	      Scanner sc = new Scanner (System.in);
		  
	   // get the user input
	      System.out.println ("Enter a number" );
		  input = sc.nextInt();
		  
	   //check inputvalue using ternary operator
		String finalOut = (inputValue==0)?"Zero":(inputValue>0)?"Positive":"Negative";
		System.out.println("The number is: "+ finalOut);

		 
     }
}	 