/**
 * contains main method and class constructor which calls method from 
 * list utility class to perform operations
 * 
 */

package unOrderList;
import regex.Utility;  //from regex package

public class UnOrderList {

	static Node start;
	Utility  u1=new Utility();
	ListUtility lu=new ListUtility();

	public UnOrderList()
	{
		try
		{
			start=lu.readFile(start);
			System.out.print("Enter the word to search :");
			String word1=u1.inputString();
			//Search the word
			start=lu.searchData(start,word1);
			String word2=" ";

			while(start!=null)
			{
				word2=word2+start.data;
				word2=word2+" ";
				start=start.nextNode;
			}
			//  u1.writeToFile(start);
			lu.writeDataToFile(word2);
		}
		catch(NullPointerException n)
		{
			System.out.println(n);
		}
	}  		//End of method

	//main
	public static void main(String[] args)
	{
		UnOrderList ul=new UnOrderList();
	}
}
