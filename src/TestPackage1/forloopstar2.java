package TestPackage1;

public class forloopstar2 
{

public static void main(String[] args )
	{ 
		for(int i=1; i<=5; i++) // count increment
		{
			for (int j=4; j>=i; j--) // space decrement
			{
				System.out.print(" ");
			}
				for (int h=1; h<=i; h++)
				{
	              System.out.print( "* ");
     	}
			
				System.out.println( );
         } 
		
		
		for(int i=1; i<=5; i++) 
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			 for (int j=4 ; j>=i ; j--)
     {
	        System.out.print("* ");
		}
			 
			 System.out.println();
		}
	}
		
}



	
	




