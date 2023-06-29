package strings;

// string is also a datatype but it is not primitive datatype
// because for primitive datatypes there is no need of calling objects directly we can store values in it
public class Strings1 {
// arrays,collections,classes are non-primitive datatypes
// strings are used to store the text like(hemanthkumar138@gmail.com) in java

	
	
	// string classa avilable in java.lang.* package and we know that this is default package
	public static void main(String[] args) {
		String jh = "hemanth kumar";
		String jj = " hemanthkumar138@gmail.com";
		System.out.println(jh+jj);
		
		String gjj = new String("hello hy");
		System.out.println(gjj);
 // strings,objects,classes are immutable
		
		
		/* 
		 * String str = "123";
  int i = Integer.parseInt(str);
  System.out.println(str + 50); //12350 because its concatenate to value.
  System.out.println(i + 50); //173 because +(plus) is binary plus operator. 
*/
	}

}
