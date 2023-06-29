 
// two dimensional array
public class Array2D {
	public static void main(String[] args) {
		int mhelo[][]=new int[3][2];
		 mhelo[0][0]=3;
		 mhelo[0][1]=43;
		 
		 mhelo[1][0]=21;
		 mhelo[1][1]=4;
		 
		 mhelo[2][0]=11;
		 mhelo[2][1]=4234;
		 
		 /*
		  *  for(int i=0;i<mhelo.length;i++) {
			 for(int j=0; j<mhelo[i].length;j++) {
				 System.out.println(mhelo[i][j]+ " li ");
		  */		 
		 for(int i=0;i<mhelo.length;i++) {
			 int[] singlerow=mhelo[i];
			 for(int j=0; j<singlerow.length;j++) {
				 System.out.println(singlerow[j]+ " li ");
			 }System.out.println(" "); 
		 }}
		}
	



// to know overally how many elements are present in the array

/*
 * for(int i=0;i<mhelo.length;i++){
 *     size+=mhelo[i].length;
 */

//another way intializing an array

/*
 int[][]={{22,34},{211,76},{450,64}}

*/


/*
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
int x = myNumbers[1][2];
System.out.println(x);

*/
// Outputs 7