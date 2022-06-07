package TestPackage1;

public class palindromenumber {
	


		public static void main(String[] args )
		{ 
			int num = 1222221,  number, rem , rev=0;
			
			number = num;
			
					while (number!=0)
					{
						rem = number%10; // extracting large digi
								
						rev= rev*10+ rem; //2*10 +2 =2 
								
					  number = number/10; // removing last digit
					}
			if (rev ==num)
			{
				System.out.println(" palindrome number" +num);
			}
			else 
				
			{
				System.out.println(" not  palindrome number" +num);
			}
		}
		}



