package keywords;

// this keyword represents the instance variables of current object
public class This1 {

	int a = 10;
	void display() {
		System.out.println(a);
// here implicitly compiler will consider the above statement as(this.a)
	}
	public static void main(String[] args) {
		This1 obj=new This1();
		obj.display();
	}
	
}
