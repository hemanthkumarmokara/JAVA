

public abstract class Abstract3 {
 abstract void display();

}
class Abstract4 extends Abstract3 {
	void display() {
		System.out.println("Abstract4");
	}
}
class Abstrac2{
	public static void main(String[] args) {
		Abstarct4 obj = new Abstract4();
		obj.display();
	}
}

