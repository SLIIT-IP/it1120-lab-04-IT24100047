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
		  
	  // check and print
	     if (input>0) 
		 {
		   System.out.print("The number is : Positive") ;
		 }
		 else if (input<0 )
         {
           System.out.print("The number is : Negative") ;
         }	
         else
         {
           System.out.print("The number is : Zero" ) ;
         }
		 
     }
}	 