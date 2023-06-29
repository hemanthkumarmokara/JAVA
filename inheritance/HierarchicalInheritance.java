package inheritance;

class Ppparent{
	int a=678;
	void disply() {
		System.out.println("this is from parent class");
	}
}
class Child1 extends Ppparent{
	double u=77.8;
	void messi() {
		System.out.println("this is from child1 class");
		
	}
}
class Child2 extends Ppparent{
	double u=776.8;
	void dhoni() {
		System.out.println("this is from child2 class");
		
	}
} 

 
public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Child2 obj =new Child2();
		obj.dhoni();
		obj.disply();
		Child1 objj =new Child1();
		objj.messi();
		objj.disply();
		
		

	}

}
