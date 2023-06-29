package basics1;
//global variable
//class variables (static)

//class variable does not need any object



// any where if there is non-static means we have to create an object
public class Variables2 {
	static int u = 66;
//static variables directly accesible in single class but in multiple classes we use class name to use the respective variable
	public static void main(String[] args) {
		
		System.out.println(u);
			}
	public static void test1() {
		System.out.println(u);
	}

}
