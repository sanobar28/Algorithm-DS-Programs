/**
 * @author Sanobar Mujawar
 * @since 15.06.21
 * 
 * Purpose: To check if Prime number is anagram or not.
 * 
 */

package algorithmPgms;

import java.util.Arrays;
import java.util.Stack;

public class PrimeAnagram {
	
	
	//boolean method to check if no. is prime or not
	public static boolean prime(int n) {
		boolean flag = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	/**
	 * Method to check if to values are anagram or not
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public static boolean check(Object m, Object n) {

		// Converted to string
		String a = String.valueOf(m);
		String b = String.valueOf(n);

		// stored in character arrays
		char[] c1 = a.toCharArray();
		char[] c2 = b.toCharArray();

		// sorted
		Arrays.sort(c1);
		Arrays.sort(c2);

		// checks if two arrays are equal
		if (Arrays.equals(c1, c2)) {
			return true;
		} else {
			return false;
		}
	}
	

	// main
	public static void main(String[] args) {

		int start = 1;
		int end = 100;
		Stack<Integer> a = new Stack<Integer>();
		Stack<Object> b = new Stack<Object>();

		// Checks is no. is prime and add it to stack
		for (int n = start; n <= end; n++) {
			if (prime(n)) { // prime method call
				a.push(n);
			}
		}
		System.out.println(a); // Prints prime number
		
		for (int j = 1; j < a.size(); j++) {
			for (int k = j + 1; k < a.size(); k++) {
				Object m = a.elementAt(j);
				Object n = a.elementAt(k);
				if (check(m, n)) { // check method call to check anagram
					b.push(m);
					b.push(n);
				}
			}
		}
		System.out.println(b); // prints prime no. which are anagram
	}

}
