/**
 * This class contains main method which takes input from user
 */

package regex;
import java.util.Date;

public class ValidateMsg {

	public static void main(String args[]) {

		Utility u = new Utility();

		UserDetails user = new UserDetails();
		System.out.println();

		// asking user to enter data
		System.out.println("Enter FirstName:");
		user.setfName(u.inputString());
		System.out.println();

		System.out.println("Enter LastName:");
		user.setlName(u.inputString());
		System.out.println();

		System.out.println("Enter Mobile Number:");
		user.setmobileNo(u.inputString());
		System.out.println();

		// Setting current date
		user.setdate(u.getFormatedDate(new Date()));
		System.out.println(u.convertString(user, u.getFileText("C:\\Users\\User\\eclipse-workspace\\java\\src\\main\\java\\regex\\file.txt")));
	}

}
