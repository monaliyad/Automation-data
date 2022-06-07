package TestPackage1;

public class armstrongnumber {
	public static void main(String[] args )
	{ 
		int num = 370,  number, rem , total=0;
		
		number = num;
		
				while (number!=0)
				{
					rem = number%10; // extracting large digit
							
					total = total + rem * rem *rem; //armstrong number 370= 3^3 + 7^3 + 0^3  
							
				  number =  number/10; // removing last digit
				}
		if (total==num)
		{
			System.out.println("armstrong number" +num);
		}
		else 
			
		{
			System.out.println(" is not armstrong" +num);
		 }
	}
	}

