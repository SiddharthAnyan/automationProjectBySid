package firstmockinterview_29dec;

public class MthOL {
	public static void test1() 
	{
		System.out.println("This is test1");
	}
	private static void test1(int a) 
	{
		System.out.println("This is test2"+a);
	}
	protected static void test1(String b, double c) 
	{
		System.out.println("This is test3 and value of b and c is : "+b+", "+c);
	}
	static void test1(float f) 
	{
		System.out.println("THis is test4 : "+f); 
	}
	public void test1(char d) 
	{
		System.out.println("This is test5: "+d);
	}
	private void test1(int e, int f) 
	{
		System.out.println("this is test6 " +e+","+f);
	}

	
	public static void main(String[] args) {
		test1();
		test1(10);
		test1("Sid",10.5);
		test1(25.75f);
		MthOL ol=new MthOL();
		ol.test1('s');
		ol.test1(20, 30);

	}

}
