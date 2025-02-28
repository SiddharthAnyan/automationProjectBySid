package firstmockinterview_29dec;


class Swap1
{
	static int a=10;
	static int b=20;
	static int c;
	
	
	public static void swap_method1() 
	{
		
		System.out.println("Value of a before swap:" + a);
		System.out.println("Value of a before swap:" + b);
		
		c=a;
		System.out.println("value of c : "+c);
		a=b;	
	System.out.println("Value of a after swap :"+a);
	b=c;
	System.out.println("Value of b after swap :"+b);
		
	}
	
	public static void swap_method2() 
	{
		a= a+b;
		System.out.println("Value of a is :"+a);
		b=a-b;
		System.out.println("Value of b is:"+b);
		a=a-b;
		System.out.println("Value of a is :"+a);
	}

}

public class SwapNum {

	public static void main(String[] args) {
		
		Swap1.swap_method1();
		Swap1.swap_method2();
		

	}

}
