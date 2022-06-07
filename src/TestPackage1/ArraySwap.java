package TestPackage1;

public class ArraySwap {
	
	public static void main (String args[])
	{
		
	 int a[]= { 5, 7, 67,56, 59,45,67,43,289,3666};
		
    
   for (int i=0; i<a.length/2; i++)
	
	{
	    int c=0;
	    c =a[i];
		a[i]= a[(a.length-1)-i];
		a[(a.length-1)-i] =c;
	}

     for(int i=0 ; i< a.length ; i++)
    	 
     {
	System.out.println(a[i]+ ",");
	   }
}
}