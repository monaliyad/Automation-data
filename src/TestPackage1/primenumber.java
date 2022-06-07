package TestPackage1;

public class primenumber {
	
	public static void main(String[] args) {
		 
		int count=0;
		
		for( int number=1; number<=100; number++)
		{
		for ( int i=2 ; i<=number-1; i++)
		{
			if (number%i==0)
			{
				count=count +1;
				
				break;
			}
			 if(count==0 )
				 
			 {
				 
			System.out.println  ( number);
			
		}
			 else
			 {
				 count = 0;
				
	
		}
		}
	}
	
}
}
