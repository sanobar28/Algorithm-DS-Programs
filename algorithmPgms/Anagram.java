/**
 * Program to check if to strings are anagram or not.
 * This class contains main method which calls
 * @isAanagramString method from @Utility class
 * 
 */

package algorithmPgms;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name");
		String str = sc.nextLine();
		System.out.println("Enter the Second name");
		String str2 = sc.nextLine();
		System.out.println(Utility.isAnagramString(str, str2));
		sc.close();
	}

}
