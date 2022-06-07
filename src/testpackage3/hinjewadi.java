package testpackage3;

public class hinjewadi {

	public String a ;
	
	public hinjewadi()
	{
		a = "public and zero argument";
	}
	 hinjewadi(int x)
	 {
		a = "default and int type argument";
	 }
	private hinjewadi (char y , int i)
	{
	a= "private and char , int type argument";
	} 
	protected hinjewadi (String z)
	{
		a = "protected and String type argument";
	}

public static void main (String[] args)
{
	hinjewadi h = new hinjewadi ();// public
	hinjewadi i = new hinjewadi (11); // default 
	hinjewadi j = new hinjewadi ('a', 89);// private 
	hinjewadi k = new hinjewadi ("arnav"); // protected
			
    System.out.println(h.a);
    System.out.println(i.a);
    System.out.println(j.a);
    System.out.println(k.a);
	
}
}