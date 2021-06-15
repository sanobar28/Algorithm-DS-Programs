/**
 * 
 * @author Sanobar Mujawar
 * @since 15.06.21
 * 
 * Utility class contains methods for classes under algorithmPgms
 * 
 */

package algorithmPgms;

import java.util.*;
import java.util.Arrays;

public class Utility {

	/**
	 * Insertion sorting method to sort string array
	 * 
	 * @param arr
	 */
	public static void insertionSortString(String arr[]) {
		for (int i = 1; i < arr.length; i++) {
			String temp = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1].compareTo(temp) > 0) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	/**
	 * Method to sort int array using bubble sort algorithm
	 * 
	 * @param arr
	 */
	public static void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	/**
	 * Method to check if two strings are anagram or not
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isAnagramString(String str1, String str2) {
		if (str1.length() == str2.length()) {
			char a[] = str1.toCharArray();
			char b[] = str2.toCharArray();

			Arrays.sort(a);
			Arrays.sort(b);
			if (Arrays.equals(a, b)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	/**
	 * Method to check if number is prime or not
	 * 
	 * @param n //number to check
	 * @return //returns boolean value
	 */
	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	
	/**
	 * Method that check 
	 * @param alist
	 * @return
	 */
	public static ArrayList<Integer> isPrimePallindrom(ArrayList<Integer> alist) {
		ArrayList<Integer> blist = new ArrayList<Integer>();
		for (int i = 0; i < alist.size(); i++) {
			int a = alist.get(i);
			int reverse = 0;
			while (a > 0) {
				int r = a % 10;
				reverse = reverse * 10 + r;
				a = a / 10;
			}
			if (reverse == alist.get(i)) {
				blist.add(reverse);
			}

		}
		return blist;
	}

}
