package firstmockinterview_29dec;

class B{
	
	public static void test3() 
	{
		System.out.println("This is test 3 static in parent");
	}
	public void test4() 
	{
		System.out.println("This is test4 nonstatic in parent");
	
	}
	
}

public class Method {
	
	public static void test1() 
	{
		System.out.println("This is test 1 static method");
	}
	public void test2() 
	{
		System.out.println("This is test 2 non-static method");
	}

	public static void main(String[] args) {
		test1();
		Method mt=new Method();
		mt.test2();
		B.test3();
		B b=new B();
		b.test4();
	

	}

}
