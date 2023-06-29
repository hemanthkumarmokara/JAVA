package inheritance;


/* inheritance is 5 types
 * 1.single inheritance
 * 2.multilevel inheritance
 * 3.hierarchical inheritance
 * directly we can achieve these 3types in JAVA 
 * 
 *    4.multiple inheritance
 *    5.hybrid inheritance
 *     directly we can achieve these 2types in JAVA
 *     we interfaces for this
 *    
 * */

class Parent{
	int a=678;
	void disply() {
		System.out.println("this is from parent class");
	}
}
class Child extends Parent{
	double u=77.8;
	void messi() {
		System.out.println("this is from child class");
		
	}
}

public class SingleInheritace {
	public static void main(String args[]) {
		Child obj=new Child();
		obj.messi();
		obj.disply();
		System.out.println(obj.u);
			
	}

}
