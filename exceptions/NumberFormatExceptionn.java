// this code is crct only don't delete it 
package exceptions;

class Exx {
	void dis() {
	 	 try {
	 		 int num;
	 		 String gg = "hy";
	 		 num = Integer.parseInt(gg);
			 
	 	 }
		catch(NumberFormatException e) {
			System.out.println(e);
		} 
			System.out.println("Exception handled") ;
	}
}

public class NumberFormatExceptionn {

	public static void main(String[] args) {
 Exx obj = new Exx();
 obj.dis();
	}

}