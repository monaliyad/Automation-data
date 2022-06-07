
package TestPackage1;

public class armno {
	
	public static void main(String args[])
	{
       int no = 121;
       int t1 = no;
       int length =0;
       
       while (t1!=0) // to find length
       {
    		   
       t1= t1/ 10;//   1) 123/ 10=12 ; 2) 12/10 =2 ; 3) 2/10 =0
	
       length = length+1; // 1+1+1
	
       }
	
       int t2 =no;
      int arm =0;
      
      while (t2!=0) // 1^3+2^3+3^3 =123
    	  
      {
    	  int rem;
    	  rem = t2%10;
    	  int mul =1;
    			  for (int i=1 ; i<=length; i++) //repeat loop 3 times
    			  {
    				  
    				  mul= mul*rem;
    			  }
    	  
    			  arm= arm + mul ;
    			  
    			  t2= t2/10;
      }
      
      if( arm==no)
    	  
      {
    	  System.out.println( "no is armstrong=  " +no);
    	  
    	  
      }
      
      else
      { 
    	  System.out.println ( "no is not armstrong =" +no);
      }
	}
    					 
      
      }
	
	
	
	
	
	
	
	
