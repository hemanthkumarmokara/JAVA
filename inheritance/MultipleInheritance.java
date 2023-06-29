package inheritance;


class Pparent{
	int a=678;
	void disply() {
		System.out.println("this is from parent class");
	}
}
class Cchild extends Pparent{
	double u=77.8;
	void messi() {
		System.out.println("this is from child class");
		
	}
}
class GrandChild extends Cchild{
	double u=776.8;
	void dhoni() {
		System.out.println("this is from grandchild class");
		
	}
} 


public class MultipleInheritance {
	public static void main(String args[]) {
		GrandChild obj=new GrandChild();
		obj.messi();
		obj.disply();
		obj.dhoni();
		System.out.println(obj.u);
			
	}

}

