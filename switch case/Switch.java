import java.util.Scanner;

public class Switch {
// switch is a value based conditional statement
// if is a condition based conditional statement 
	public static void main(String[] args) {
// in switch indirectly double equals(==) to only performs 
		//no lessthan or greaterthan symbols are invloved 
		Scanner helo = new Scanner(System.in);
		System.out.println("enter the number : ");
		int hy = helo.nextInt();
		switch(hy) {
		case 1 :
			System.out.println("welcome to the first case");
		case 2 :
			System.out.println("welcome to the second case");
		case 3 :
			System.out.println("welcome to the third case");
			//break();
		case 4 :
			System.out.println("welcome to the fourth case");
		default :
			System.out.println("welcome to the default case");
		}helo.close();
		

	}

}
