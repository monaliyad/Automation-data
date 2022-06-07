package TestPackage1;

public class nestedif {
	
public static void main(String[] args )
{
int a=45;
int b=89;
int c=32;
int d=92;
{
	if(a>b)
	{
		if (a>c)
		{
			if (a>d)
			{
		      System.out.println(" a is largest =" +a);
	        }
			else
			{
				System.out.println(" d is largest =" +d);	
             }
			}
		else
		{
		if (c>d)
		    {
			  System.out.println(" c is largest =" +c);
			}
			else
			{
				System.out.println(" d is largest =" +d);
			 }
		}
	}
		else
	   {
		       if (b>c)
			     { 
					if (b>d)
					{
						System.out.println(" b is largest =" +b);
					}
					else
					{
						System.out.println(" d is largest =" +d);
					}
				}
					
				else
				{
				 if (c>d)
					{
					System.out.println(" c is largest =" +c);
					}
					else
					{
						System.out.println(" d is largest =" +d);
					}
				}
					}
				}
}
}
				

		
		



