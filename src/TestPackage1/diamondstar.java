package TestPackage1;

public class diamondstar {
	
	public static void main(String[] args )
	{
		for (int i=1 ; i<=10 ;i++)// count increment
		{
			for(int j=9; j>=i; j--) // space decrement
    {
       System.out.print(" "); 
    }
			
			for(int k=1; k<=((i*2)-1 ); k++) // star increment
			{ 
				
				System.out.print( "*");
			}
			
			System.out.println();
			}
		
		
		
		
		for (int i=9 ; i>=1 ;i--)// count decrement
		{
			for(int j=9; j>=i; j--) // space decrement
    {
       System.out.print(" "); 
    }
			
			for(int k=1; k<=((i*2)-1 ); k++) // star decrement
			{ 
				
				System.out.print( "*");
			}
			
			System.out.println();
			}
}
		
}
	
	

