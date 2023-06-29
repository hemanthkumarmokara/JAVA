package keywords; 
class Parent3 {
	Parent3(){
		System.out.println("parent constructor");
	}
	int a =45;
	void display() {
		System.out.println("hy this is parent class method");
	}
}
class Child3 extends Parent3 {
	/*  here super(); implicitly called by the JVM for the parent constructor   */
	Child3(){
		System.out.println("child constructor");
	}
	int  a=30;
	void display() {
		System.out.println("CHILD CLASS");
		//System.out.println(b);
		System.out.println(a);
		System.out.println(super.a);

		super.display();
	}
}
public class Super3 {
	public static void main(String[] args) {
		Child3 obj = new Child3();
		obj.display();
	}

}
