

//here always static block will be executed first
//here static block will execute when there is a reference statement in respective classs 
 class Static {
 static int a=10;
 
 static void displayy() {
	 System.out.println("static method");
 }
 static {
	 System.out.println("this is static block");
 }
 
}
 class Static1 {
 public static void main(String args[]) {
	  //System.out.println("hello hy");
	 
	 System.out.println(Static.a);
	 Static.displayy();
	 
 }
}

