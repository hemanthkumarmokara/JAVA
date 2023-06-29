package overriding;


/* method overriding will be done with the help of inheritance
  Method name should be same in both super class and sub class
  return type,scope(public and all),parameters should be same
  
  
  static methods can't be overriden
  if we declare a final keyword any method it can't be overriden
  because if we use the final keyword to any method they can't be inherited
   */
class Parent4{
	void display() {
		System.out.println("parent");
	}
}
class Child4 extends Parent4{
	void display() {
		// super.display();
		System.out.println("child");
	// here "display()" method in parent class is overrided by the display() method in child class 
	// then we have to use super keyword to access method in parent class
	}
}  


public class MethodOverriding {
public static void main(String[] args) {
	Child4 obj = new Child4();
	obj.display();
}
}
