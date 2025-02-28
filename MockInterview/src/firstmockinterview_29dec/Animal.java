package firstmockinterview_29dec;

class A
{
	A()
	{
		System.out.println("Parent Constructor");
	}
	A(int a)
	{
		System.out.println("Value of a is "+a);
	}

}
public class Animal extends A {
	
	Animal()
	{
		
		super(10);
		System.out.println("This is child constructor");
		
	}

	public static void main(String[] args) {
		new Animal();
		
    }

}
