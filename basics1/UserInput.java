package basics1;

import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {

		Scanner helo = new Scanner(System.in);
		// helo.nextInt
		// helo.nextFloat
		// helo.nextDouble
		// helo.nextLine
		
		System.out.println("what's your name : ");
		String ty = helo.nextLine();
		System.out.println("what's your age : ");
		int ju = helo.nextInt();
		helo.close();
	}

}
