/**
 * 
 * @author Sanobar Mujawar
 * @since 15.06.21
 * 
 * 
 * Purpose: Search string from file using binary search algorithm
 * 
 */


package algorithmPgms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BinarySearchFile {

	
	/**
	 * Method to compare and search string
	 * @param alist  //list of string from which we will search
	 * @param x   //String to search
	 * @return
	 */
	public static int binarySearch(List<String> alist, String x) {
		int l = 0;
		int r = alist.size();
		while (l <= r) {
			int mid = l + (r - 1) / 2;
			int result = x.compareTo(alist.get(mid)); 
			if (result == 0)
				return mid;
			if (result > 0)
				l = mid + 1;
			else
				r = mid - 1;
		}
		return -1;
	}

	//main
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		List<String> l = new ArrayList<String>();
		File file = new File("D:/Sana Study/Bridgelabz Solutions/Fellowship pgm/JAVA material/BinarySearch.txt");  //input file
		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while ((st = br.readLine()) != null) {    //to add string in list
			l.add(st);
		}
		System.out.println("Enter the name for Search"); //take input from user to search
		String x = sc.nextLine();
		Collections.sort(l);
		System.out.println(l);
		int val = binarySearch(l, x);  //method call
		if (val == -1)
			System.out.println("Name did not found");
		else
			System.out.println("found at position  " + val);
		sc.close();
		br.close();
	}

}
