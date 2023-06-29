package methods;
// methods blue print

//   accessModifier  staticOrNonStatic  returnType  methodName(parameters) throwsExeceptionList {
//   method body
//   return value;
//   }


//  *** void is not a datatypee it is reserved key word

// main method is needed to run an application in Eclipse
// method is a block of code
public class Methods1{
	
	static int currentBalance = 10000;
	//static methods directly accesible in single class but in multiple classes we use class name to use the respective method
public void greetCustomer() {
	// by default method will be non-static 
	System.out.println("welcome to banking applications");
}
public void deposit(int amount) {
	currentBalance = currentBalance+amount;
	System.out.println(amount + " rupee deposited successfully");
}
public static void withDrawl(int amountt) {
	currentBalance = currentBalance-amountt;
	System.out.println(amountt + " rupee withdrawn successfully");
	
}
public void getCurrentBalance() {
	
	System.out.println("currentBalance is : " + currentBalance);
}
public static void main(String[] args) {
	Methods1 bank = new Methods1();
	bank.greetCustomer();
	bank.deposit(7000);
	withDrawl(2000);
	bank.getCurrentBalance();
}
}

/*

void display();
this is called method declaration

void display(**){
sysout("hello");
}

this is called method definition

*/
