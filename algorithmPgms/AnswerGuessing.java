package algorithmPgms;

import java.util.Scanner;

public class AnswerGuessing {

	public static int search(int lo, int hi) {
		Scanner sc1 = new Scanner(System.in);

		String yes = "y";
		String no = "n";
		
		if ((hi - lo) == 1)
			return lo;
		int mid = lo + (hi - lo) / 2;
		System.out.println("Is it less than " + mid);
		if (sc1.nextLine() == yes)
			return search(lo, mid);
		else
			return search(mid, hi);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int userInput = sc.nextInt();
		int n = (int) Math.pow(2, userInput);
		System.out.println("Think of an integer between " + 0 + " and" + " " + (n - 1));
		int secret = search(0, n);
		System.out.println("Your number is less than " + secret);
		sc.close();

	}

}
