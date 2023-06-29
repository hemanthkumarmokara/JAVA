
import java.util.Vector;
import java.util.*;
class Greedy
{
	static int deno[] = {};
	l1=sc.nextInt();
	l2=sc.nextInt();
	l3=sc.nextInt();
	deno[0]=l1
	deno[1]=l2
	deno[2]=l3
	static int n = deno.length;

	static void findMin(int V)
	{
		// Initialize result
		Vector<Integer> ans = new Vector<>();

		// Traverse through all denomination
		for (int i = n - 1; i >= 0; i--)
		{
			// Find denominations
			while (V >= deno[i])
			{
				V -= deno[i];
				ans.add(deno[i]);
			}
		}

		// Print result
		for (int i = 0; i < ans.size(); i++)
		{
			System.out.print(
				" " + ans.elementAt(i));
		}
	}
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(
			"Following is minimal number "
			+"of change for " + n + ": ");
		findMin(n);
	}
}
