package testpackage3;// constructor overloading

public class testclass{

	int a;
	
	testclass()
	{
		 a = 56;
		System.out.println(a);
	}
	testclass(int a)
	{
		 a = 67;
	System.out.println(a);
}
	testclass (int c,char g)
	{
		a =69;
		System.out.println( a);
	}
	
	testclass (int a , String h)
	{
		a= 56;
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		testclass t = new testclass();
		testclass o = new testclass(89);
		testclass p = new testclass(78, '9');
		testclass u = new testclass( 78, "velocity");
	}
	
		

}

