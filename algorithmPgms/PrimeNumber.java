package algorithmPgms;

import java.util.ArrayList;

public class PrimeNumber {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i <= 1000; i++) {
			if (Utility.isPrime(i)) {
				list.add(i);
			}
		}
		System.out.println(list);

	}

}
