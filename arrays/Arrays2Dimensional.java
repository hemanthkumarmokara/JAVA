 
public class Arrays2Dimensional {

	public static void main(String[] args) {
		int[][] myNumbers = { {11, 22, 33, 44}, {55, 66, 77} };
	     for (int i = 0; i < myNumbers.length; ++i) {
	        for(int j = 0; j < myNumbers[i].length; ++j) {
				System.out.println("myNumbers[" + i + "][" + j + "] = "+ myNumbers[i][j]);
	        }
	     }
	   }
	}

	
 