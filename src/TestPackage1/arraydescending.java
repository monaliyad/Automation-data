package TestPackage1;

public class arraydescending {
	
	public static void main (String args[])
	{
		int a[]= {15, 14 ,17 ,67 };
		int c=0;
	     int i;
	      int j;
		for (i=0 ;  i<a.length ; i++)
			
		{
			for ( j= i+1 ; j<a.length ; j++)
			{
			 if (a[i] > a[j])
			 {
				 c = a[i];
				 a[i] = a[j];
				a[j] =c;
			 }
				
	}
			for (i=0 ;  i<a.length ; i++)
				
			{
				System.out.println( a[i] + " ,");		
				
			}
			}
				
			
		}
		
		
		
		
	}
	

 

