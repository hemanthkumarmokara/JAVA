/*
here while recursive function is executing..
the methods will go into stack(first executed method will enter first in stack). after the completion of it's execution it will come out of stack
 */

public class Recursion1 {
	static void jkhi(int count){
		if (count<=1){
			System.out.println("hlo");
			return;
		}
		jkhi(count - 1);
	}

// this is called tale reccursion
// because the last statement that is to be executed is ("jkhi(4)") 
	public static void main(String[] args) {
		jkhi(4);
	}

}
