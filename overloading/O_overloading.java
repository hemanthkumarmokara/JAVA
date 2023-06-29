package overloading;

public class O_overloading {
	
	void add() {
		int a=10,b=30;
		System.out.println("a+b="+a+b);
	}
	
	void add(int s,int t) {
		System.out.println("s+t="+(s+t));
	}
public static void main (String args[]) {
	O_overloading obj=new O_overloading();
	obj.add();
	obj.add(10, 50);
}
}
