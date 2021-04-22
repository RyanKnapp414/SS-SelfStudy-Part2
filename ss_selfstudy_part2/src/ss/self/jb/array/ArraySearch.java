/**
 * 
 */
package ss.self.jb.array;

/**
 * Simple search to find largest value in 2D array
 * 
 * @author Ryan Knapp
 *
 */
public class ArraySearch {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		// print the results of the findMaxNumber method
		System.out.println(findMaxNumber(numArray));

	}

	// example array
	static int[][] numArray = { 
			{ 12, 5, 17, 23 }, 
			{ 4, 26, 46, 21 }, 
			{ 8, 37, 11, 14 },
			{ 13, 0, 16, 42 }
			};

	// method to find them max number in an array and its position in the array
	public static String findMaxNumber(int[][] array) {
		// creating variables
		String maxValue;
		String arrayPos = "no position found";
		int maxNum = array[0][0];
		int row = array.length;
		int col = array[0].length;

		// loop through the array to find the max number and position
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				// if the current array value is larger than the largest number so far update
				// the largest number so far
				if (maxNum < array[i][j]) {
					maxNum = array[i][j];
					arrayPos = Integer.toString(i) + "," + Integer.toString(j);
				}
				// if the max number is present in multiple places within the array all positions
				// are printed
				else if (maxNum == array[i][j]) {
					arrayPos = arrayPos + " and " + Integer.toString(i) + "," + Integer.toString(j);
				}

			}
		}

		maxValue = "The max number is " + Integer.toString(maxNum) + " at " + arrayPos;
		return maxValue;
	}
}
