/**
 * 
 * @author Sanobar Mujawar
 * @since 15.06.21
 * 
 * Purpose: To search string array using insertion sorting
 * 
 */

package algorithmPgms;
import java.util.Scanner;

public class InsertionSortString {
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("number of Strings");
		int n = sc.nextInt();
		String arr[] = new String[n+1];
	
		System.out.println("Enters Entries");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextLine();
		}
		Utility.insertionSortString(arr);
		sc.close();
		long end = System.currentTimeMillis();
		System.out.println("Time is taken by to program in milli seconds "+(end-start)); //to check time required for sorting
	}

}
