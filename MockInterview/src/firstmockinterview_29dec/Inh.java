package firstmockinterview_29dec;

class C
{
	public static void test2() 
	{
		System.out.println("This is test2");
		
	}
	protected void test3() 
	{
		System.out.println("This is test3");
	}

}

public class Inh extends C {
	
	public static void test1() 
	{
		System.out.println("This is test1");
	}

	public static void main(String[] args) {
		Inh in=new Inh();
		test1();
		test2();
		in.test3();
	

	}

}
