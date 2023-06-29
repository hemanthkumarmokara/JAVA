package keywords;

public class This2 {

	int a = 10; 
	void display() {
		int a=200;
		System.out.println(a);
		System.out.println(this.a);
 
	}
	public static void main(String[] args) {
		This2 obj=new This2();
		obj.display();
	}
	
}  
