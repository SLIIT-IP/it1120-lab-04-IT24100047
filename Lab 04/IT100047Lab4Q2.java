import java.util.Scanner;
public class IT100047Lab4Q2
{
    public static void main (String [] args ) 
	{
	   // define data type of variable
	      double emarks , labmarks , mpercentage, lpercentage , sumofpercentages ,finalmarks ;
		  
		  
       // making scanner object 
	      Scanner sc = new Scanner (System.in);
		  
	   // get the  exam marks  input
	      System.out.println ("Please enter exam marks (out of 100): " );
		  emarks = sc.nextDouble();
		  
	     // check and print
	     if (emarks < 0 || emarks > 100 )
		 { 
		  System.out.println("Invalid inputs for exam marks. Terminating program.");
	      System.exit(0);	
		 }		
  
		// get the lab marks input
	      System.out.println ("Please enter lab marks (out of 100): " );
		  labmarks = sc.nextDouble();
		  
	     // check and print
	     if (labmarks < 0 || labmarks > 100 )
		 {
          System.out.println("Invalid inputs for lab marks. Terminating program.");
	      System.exit(0);
		 }
		 
        // get percentages 
		 System.out.print("Please enter the precentage given for the exam: ");
		 mpercentage = sc.nextDouble();
		 System.out.print("Please enter the precentage given for the lab submission: ");
		 lpercentage = sc.nextDouble();
        if ( mpercentage + lpercentage !=100 )
	    {
		  System.out.print("Please the precentage must add up to 100. Terminating the Progarm.");
          System.exit(0);
		 }
		 
       System.out.println("Final Exam Mark is : "+ ((emarks)*(mpercentage/100)) + ((labmarks)*(lpercentage/100)) );
	
		
	}
}		   