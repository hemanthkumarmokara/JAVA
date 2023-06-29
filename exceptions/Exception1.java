 
package exceptions;

/* here there are two exceptions involved in this here jdk will consider only one that is first one
and it ignores the 2nd exception  */

class Exjx {
	void dis() {
	 	 try {
	 		 int yy = 8/0;
	 	 
	 		 int num;
	 		 String gg = "hy";
	 		 num = Integer.parseInt(gg);
			 
	 	 }
		catch(Exception e) {
			System.out.println(e);
		} 
			System.out.println("Exception handled") ;
	}
}

public class Exception1 {

	public static void main(String[] args) {
 Exjx obj = new Exjx();
 obj.dis();
	}

}