package keywords;
/*  
// * super keyword is used to access immediate parent class methods and variables
 *  super keyword is used to access immediate parent class methods and methods
 *   super keyword is used to access immediate parent class methods and constructors
 *  */

class Parent1 {
	int a =45;
	void display() {
		System.out.println("hy this is parent class");
	}
} 
class Child1 extends Parent1 {
	int  a=30;
	void messi() {
		System.out.println("CHILD CLASS");
	 	//System.out.println(b);
		System.out.println(a);
		System.out.println(super.a);
		//here first preference will be to the with in the method
		display();
	} 
}
public class Super1 {
	public static void main(String[] args) {
		Child1 obj = new Child1();
		obj.messi();
	}
}
