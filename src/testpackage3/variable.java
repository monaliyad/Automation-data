package testpackage3;

class variable {
	
static int a = 45; // static variable
       int b= 68; // non static variable
       
       public static void main(String[] args) {
	
    	 variable d = new  variable(); // object created to call non static variable
    	 
    	 System.out.println(d.b);
    	 
    	 variable g = new variable();// to call non static variable
    	 
    	 System.out.println(g.b);
    	 
    	 g.b = 456;
    	 
    	 System.out.println(d.b);
    	 System.out.println(g.b);
         System.out.println(variable.a); 
    	   
    	   
	}
}



