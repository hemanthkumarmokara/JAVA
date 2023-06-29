package overloading;

public class C_overloading {
	
	C_overloading(){
		System.out.println("constructor without arguements");
	}
	C_overloading(int q){
		System.out.println("constructor with arguements");
	}}

	class C_overloading2{
	public static void main(String[] args) {
		C_overloading obj11=new C_overloading(); 
		C_overloading obj22=new C_overloading(56);
		
		
	}

}
