package testpackage3;

public class Stringmethod {

	private static String y;
	private static String v;

	public static void main(String[] args) {
		
		String a = "velocity";
        String b = "  VELOCITY   ";
		
		 String c = new String ("velocity");
		 String d =  new String("Velocity");
		 
		System.out.println(a==b); // adress comparison
		 System.out.println(b==c);
		System.out.println(c==d);
		 System.out.println(d==a);
		 System.out.println(c==a);
		 System.out.println( a );
		 
		 
		 boolean result = a.equals(c); //compare data
		 System.out.println( result);//
		
		  System.out.println( "string value = "  +a);
		 
		  char u = a.charAt(6);
		  System.out.println( "character value = " +u);
	
		  String p = a.repeat(8);
		  System.out.println( p);
		  System.out.println(a.codePointAt(4));
		  System.out.println(a.codePointBefore(3));
		  System.out.println(a.compareTo(b));
		  System.out.println(a.toUpperCase());
		  System.out.println(a.toLowerCase());
		  System.out.println(a.concat("class"));
		  System.out.println(a.concat(b));
		  
		  System.out.println(a.equals(b));
		  
		System.out.println(a.endsWith("ty"));
		
		  System.out.println(a.equalsIgnoreCase(b));
		  System.out.println(a.equals(b));
		  System.out.println(b.trim());
		  System.out.println(a.length());
		  System.out.println(a.indexOf("v"));
		  System.out.println(a.lastIndexOf("y"));
		  System.out.println(a.isBlank());
		  System.out.println(a.hashCode());
		  System.out.println(a.formatted("monali"));
	  System.out.println(a.matches("velocity"));
		 
		  
		
	
	}
}
