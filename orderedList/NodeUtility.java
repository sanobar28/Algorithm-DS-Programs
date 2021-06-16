/**
 * @author Sanobar Mujawar
 * @since 16.06.21
 * 
 * Purpose: Contains method perform operations on Node such as
 * read, write, add, search, sort 
 * 
 */

package orderedList;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io. BufferedReader;
import java.io.IOException;

public class NodeUtility {
	

	String[] stringArray;
    int[] intArray;


	/**
	 * Read the file which contains integer values
	 * @return
	 */
	public int[] integerFileReader()
	{
		try
		{
			String intFile = new String();
			FileReader fr = new FileReader("C:\\Users\\User\\eclipse-workspace\\java\\src\\main\\java\\orderedList\\integer.txt");
			BufferedReader br = new BufferedReader(fr);
		    String s;

		    while((s = br.readLine()) != null) 
			{
		        intFile += s;
		    }

		    intFile = intFile.replaceAll("\\n",",");
		    intFile = intFile.trim();
		    stringArray = intFile.split(","); 
		    intArray = new int[stringArray.length];

		    for(int i=0; i <intArray.length;i++)
		    {
		        try
		        {
		            intArray[i]= Integer.parseInt(stringArray[i]);
		        }
		        catch(NumberFormatException e)
		        {
		            System.out.println(e);
		        }
		    }
		}
		catch(Exception obj)
		{
		    System.out.println("e");
		}
        	return intArray;
    }
	//End of insert method
	
	
	/**
	 * Method to add Number to list
	 * @param node1
	 * @param num
	 * @return
	 */
	public Node addWordstoList(Node node1,int num)
	{
    	Node node2=node1;
    	Node newNode=new Node();
    	newNode.data=num;
    	newNode.nextNode=null;

	    if(node1==null)
	    {
	      	return newNode;
	    }
	    else
		{
	      	while(node1.nextNode!=null)
	      	{
				node1=node1.nextNode;
	      	}
	      		node1.nextNode=newNode;
	    }
    	return node2;
	}//End of insert method
	

	/**
	 * Sorting linked list in ascending order
	 * @param arr
	 * @return
	 */
  	public int[] sort(int[] arr )
	{
    	int size=arr.length;
    	for(int i=size;i>0;i--)
		{
      		for(int j=1;j<size;j++)
			{
        		if(arr[j-1]>arr[j])
				{
          			int temp=arr[j-1];
          			arr[j-1]=arr[j];
          			arr[j]=temp;
        		}
      		}
      		size--;
    	}
    	return arr;
  	}//End of sorting method

	/**
	 * Searching number in List
	 * @param tNode1
	 * @param num
	 * @return
	 */
  	public Node search(Node tNode1, int num)
	{
    	Node tNode=tNode1;

    	//No elements in an list(List empty)
    	if(tNode==null)
		{
      		Node newNode=new Node();
			newNode.data=num;
			tNode=newNode;
			return tNode; 
    	}

    	//Search number is first in list
    	if(tNode.data==num)
		{
      		tNode=null;
      		return tNode1; //
    	}

    	//Search num
    	while(tNode!=null)
		{
      		if(tNode.nextNode==null)
			{
        		return tNode1;
      		}
      
      		if(tNode.nextNode.data==num)
			{
        		tNode.nextNode=tNode.nextNode.nextNode;
        		return tNode1;
      		}
     	 	tNode=tNode.nextNode;
    	}
    	return tNode1;
  	}

	/**
	 * method to write in file
	 * @param tNode
	 */
  	public void writeFile(Node tNode)
	{
    	try
		{
			String tString="";
		    File file=new File("C:\\Users\\User\\eclipse-workspace\\java\\src\\main\\java\\orderedList\\NewText.txt");
		    file.createNewFile();
		    FileWriter fw=new FileWriter(file);

		    while(tNode!=null)
			{
		      	tString+=String.valueOf(tNode.data);
		      	tString+=" ";
		      	tNode=tNode.nextNode;
		    }
		    //System.out.println("string "+tString );
		    fw.write(tString);
		    fw.close();
		}
		catch(IOException e)
		{
		System.out.println(e);
		}
	} //end of method

}
