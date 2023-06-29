//package javaaabstract

abstract class A
{
	abstract void display();
	void show()
	{
		System.out.println("show method");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("Abstract Method in A");
	}
}
class AbstractMain
{
	public static void main(String arg[])
	{
		B obj = new B();
		obj.display();
		obj.show();
	}
}