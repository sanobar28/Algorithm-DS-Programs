package algorithmPgms;

import java.util.ArrayList;

public class PrimePalindrom {

	/**
	 * main method to check if prime no. is palindrome or not
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		for (int i = 0; i <= 1000; i++) { //to check if no. is prime 
			if (Utility.isPrime(i)) {
				list1.add(i);
			}
		}

		System.out.println(list1);
		list2 = Utility.isPrimePallindrom(list1); //check if prime no. is also palindrom
		System.out.println(list2);
	}

}
