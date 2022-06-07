package testpackage3;

public class thane {
	
	public static void main (String[] args)
	{
	
	hinjewadi h = new hinjewadi ();// public
	hinjewadi i = new hinjewadi (11); // default 
	//hinjewadi j = new hinjewadi ('a', 89);// private 
	hinjewadi k = new hinjewadi ("arnav"); // protected
			
    System.out.println(h.a);
    System.out.println(i.a);
    //System.out.println(j.a); private
    System.out.println(k.a);
	}
}
