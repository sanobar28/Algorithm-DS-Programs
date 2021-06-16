/**
 * 
 * @author Sanobar Mujawar
 * @since 16.06.21
 * 
 * Purpose: Utility class which contains methods for validating user input using regex
 * 
 */

package regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;
import java.io.File;
import java.io.FileWriter;

public class Utility {

	BufferedReader br;
	private final String REGEX_NAME = "<<name>>";
	private final String REGEX_FULLNAME = "<<full name>> ";
	private final String REGEX_MOBILE_NO = "xxxxxxxxxx";
	private final String REGEX_DATE = "12/06/2016";

	// constructor to initialize bufferedReader
	public Utility() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * Regex pattern matcher match the string and replace the regex pattern with
	 * user details.
	 * 
	 * @param userDetails
	 * @param message
	 * @return
	 */
	public String convertString(UserDetails userDetails, String message) {
		Pattern p = Pattern.compile(REGEX_NAME);
		Matcher m = p.matcher(message);
		message = m.replaceAll(userDetails.getfName());

		p = Pattern.compile(REGEX_FULLNAME);
		m = p.matcher(message);
		message = m.replaceAll(userDetails.getfName() + " " + userDetails.getlName());

		p = Pattern.compile(REGEX_MOBILE_NO);
		m = p.matcher(message);
		message = m.replaceAll(userDetails.mobileNo());

		p = Pattern.compile(REGEX_DATE);
		m = p.matcher(message);
		message = m.replaceAll(userDetails.date());

		return message;
	}

	/**
	 * take input word as string
	 * 
	 * @return
	 */
	public String inputString() {
		try {
			return br.readLine();
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		return "";
	}

	/**
	 * To take Integer Input
	 * 
	 * @return
	 */
	public int inputInteger() {
		try {
			try {
				return Integer.parseInt(br.readLine());
			} catch (NumberFormatException nfe) {
				System.out.println(nfe.getMessage());
			}
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		return 0;
	}

	/**
	 * To take Double Input
	 * 
	 * @return
	 */
	public double inputDouble() {
		try {
			try {
				return Double.parseDouble(br.readLine());
			} catch (NumberFormatException nfe) {
				System.out.println(nfe.getMessage());
			}
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		return 0.0;
	}

	/**
	 * Take number of random number to generate as input and return array of random
	 * number
	 * 
	 * @param number
	 * @return
	 */
	public int[] getRandomArray(int number) {
		Random randomGenerator = new Random();
		int array[] = new int[number];
		for (int i = 0; i < number; i++) {
			array[i] = randomGenerator.nextInt();
		}
		return array;
	}

	/**
	 * Function take String in dd/mm/yyyy format and return Date Object
	 * 
	 * @param date
	 * @return
	 */
	public Date printDate(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try {
			return sdf.parse(date);
		} catch (ParseException pe) {
			return null;
		}
	}

	/**
	 * format date object in this format 01/12/2016
	 * @param date
	 * @return
	 */
	public String getFormatedDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		return sdf.format(date);
	}

	/**
	 * Take file name as input and return string of file text
	 * @param fileName
	 * @return
	 */
	public String getFileText(String fileName) {
		try {
			br = new BufferedReader(new FileReader(fileName));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			return sb.toString();
		} catch (Exception e) {
			return null;
		} finally {
			try {
				br.close();
			} catch (IOException ioe) {
			}
		}
	}

	/**
	 * This function take two parameter data to write and filename
	 * @param data
	 * @param fileName
	 * @throws Exception
	 */
	public void writeToFile(String data, String fileName) throws Exception {
		File file = new File(fileName);
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter writer = new FileWriter(file);
		// Writes the content to the file
		writer.write(data);
		writer.flush();
		writer.close();
	}
}
