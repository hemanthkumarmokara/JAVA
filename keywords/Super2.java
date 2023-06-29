package keywords;


class Parent2 {
	int a =45;
	void display() {
		System.out.println("hy this is parent class");
	} 
}
class Child2 extends Parent2 {
	int  a=30; 
	void display() {
		System.out.println("CHILD CLASS");
		//System.out.println(b);
		System.out.println(a);
		System.out.println(super.a);
		//display();
		super.display();
	}
}
public class Super2 {
	public static void main(String[] args) {
		Child2 obj = new Child2();
		obj.display();
	}

}
