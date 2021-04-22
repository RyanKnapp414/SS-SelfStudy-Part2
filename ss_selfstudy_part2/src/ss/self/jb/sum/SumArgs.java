/**
 * 
 */
package ss.self.jb.sum;

/**
 * Simple summation of arguments
 * 
 * @author Ryan Knapp
 *
 */
public class SumArgs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declaring variables
		Double sum = 0.0;
		int exceptionCount = 0;

		System.out.println("args:");

		// loop through args
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
			// try catch to catch any non-number args
			try {
				// add all args that are numbers
				double currentNum = Double.parseDouble(args[i]);
				sum = sum + currentNum;
			} catch (Exception e) {
				// add to exception count
				exceptionCount++;
			}
		}
		// formatting
		System.out.println();
		// print exception count for all errors
		if (exceptionCount > 0) {
			System.out.println(exceptionCount + " arg(s) could not be added.");
		}
		// print sum of all args
		System.out.println("Sum of args: " + sum);
	}

}
