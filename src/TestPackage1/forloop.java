package TestPackage1;

public class forloop
{

	public static void main(String[] args )
	{ 
		for(int i=1; i<=5; i++)// count increment
		{
			for (int j=4; j>=i; j--)// space decrement
			{
				 System.out.print( ' ');
              }
		for (int h=1; h<=i; h++)// star increment
			{
              System.out.print( "*");
	     	}
			System.out.println();
     	}
    }
}


