/**
 * @author Sanobar Mujawar
 * @since 16.06.21
 * 
 * Purpose: Contains method perform operations on List Node such as
 * read, write, add, search 
 * 
 */

package unOrderList;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.lang.NullPointerException;


public class ListUtility
{
	
	/**
	 * Reading string from file
	 * @param start
	 * @return
	 */
	public Node readFile(Node start)
	{
		try{
	           	FileInputStream fis = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\java\\src\\main\\java\\unOrderList\\inputfile.txt");
	           	char ch;
	           	String word3="";
	           	while (fis.available() > 0)
	           	{
					ch = (char) fis.read();
	             	word3=word3+ch;
	           	}
	           	String[] wordsArray=word3.split(" ");
				for(int i =0; i < wordsArray.length ; i++)
				{
	           		start=addWordstoList(start,wordsArray[i]);
				}
			}
	     	catch(NullPointerException ne)
	     	{
	     		System.out.println(ne);
	     	}
			catch(IOException e){
			}
			return start;
	 }//End of read method

	
	/**
	 * Insert words to list
	 * @param node1
	 * @param str
	 * @return
	 */
	public Node addWordstoList(Node node1,String str)
	{
	   Node node2=node1;
	   Node newNode=new Node();
	   newNode.data1=str;
	   newNode.nextNode=null;
	   if(node1==null)
	   {
	     return newNode;
	   }
	   else{
	     while(node1.nextNode!=null)
	     {
	       node1=node1.nextNode;
	     }
	     node1.nextNode=newNode;
	   }
	   return node2;
	}//End of insert method

	
	/**
	 * Search words
	 * @param node
	 * @param word
	 * @return
	 */
	public Node searchData(Node node,String word)
	{
	     Node temp=node;
	     while(node.nextNode!=null){
	       if(word.compareTo((node.nextNode).data1)==0)
	       {
	         node.nextNode=(node.nextNode).nextNode;
	         System.out.println("Word is Found");
	         System.out.println("the founded word is deleted from the file");
	         System.out.println("file saved");
	         return temp;
	       }
	       node=node.nextNode;
	     }
	     System.out.println("Word is not Found");
	     System.out.println("the not founded word is added to the file");
	     System.out.println("file saved");
	     temp=addWordstoList(temp,word);
	     return temp;
	}//End of Search word

	
	/**
	 * writeToFile
	 * @param nWord
	 */
	public void writeDataToFile(String nWord)
	{
		try{
			File fi=new File("C:\\Users\\User\\eclipse-workspace\\java\\src\\main\\java\\unOrderList\\inputfile.txt");
	      	fi.createNewFile();
	      	FileWriter fw=new FileWriter(fi);
	        fw.write(nWord);
	        fw.close();
		}
		catch(IOException e){
		}
	}
}