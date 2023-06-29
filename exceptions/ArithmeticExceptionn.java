package exceptions;
// exceptions is used to raise an exception and to handle an exception and to avoid abnormal termination in program

/*
 there are some key words involved in this are              try,catch,throw,
 
 try block == here we write the code in which we are expecting exceptions
 catch block == whatever exceptions we got in try block will handle in catch block
 
 both are inter related blocks
 */
class Ex {
	void dis() {
		// if we don't know what type of exception is getting then we have to write  "Exception"    in  catch block
	   try {
			int aa=6/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}  
		int aa=6/0;
		System.out.println(aa);   
		
	}
}

public class ArithmeticExceptionn {

	public static void main(String[] args) {
 Ex obj = new Ex();
 obj.dis();
	}

}
