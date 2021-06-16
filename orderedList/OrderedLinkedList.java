/**
 * @author Sanobar Mujawar
 * @since 16.06.21
 * 
 * Purpose: Contains method perform operations on Ordered Linked List.
 * 
 */

package orderedList;
import regex.Utility;

public class OrderedLinkedList {
	

    Node start;
    NodeUtility nu=new NodeUtility();
    Utility u1=new Utility();

    /**
     * get data From a file
     */
    void getDataFromFile()
    {
        int[] retArry =nu.integerFileReader();
        int[] sortArray =nu.sort(retArry);
        int size =retArry.length;
        System.out.println("Array Size is "+size);
        for(int i=0;i<size;i++)
        {

            addItem(retArry[i]);
        }
    }

    /**
     * Function for List
     */
    public void List()
    {
        if(start ==null)
        {
            System.out.println("List is Empty ");
        }
    }

    /**
     * add item Method
     * @param data
     */
    public void addItem(int data)
    {
        Node head =start;
        Node temp =new Node();
        temp.data =data;
        temp.nextNode =null;
        if(start == null)
        {
            start = temp;
        }
        else
        {
            while(head.nextNode != null)
            {
                head=head.nextNode;
            }
            head.nextNode=temp;
        }
    }

   /**
    * Method to display list 
    */
   public  void display()
   {
        Node temp =start;
        while( temp != null)
        {
            System.out.print(temp.data+"---->");
            temp=temp.nextNode;
        }
        System.out.println(" ");
    }

   /**
    * Size of Linked list
    * @return
    */
   public  int size()
   {
        int count=0;
        Node temp =start;
        while( temp.nextNode != null)
        {
            temp=temp.nextNode;
            count++;
        }
        System.out.println("size of Linked List "+count);
        return count;
   }

   /**
    * Method for Searching of a Word in Linked list 
    */
   public void searchData()
   {
        Node temp = start;
        int count=0;
        System.out.println("Enter a number to Search");
        int s =u1.inputInteger();
        int flag=0;
        while(temp.nextNode != null)
        {
            count++;
            if( temp.data==s)
            {
                System.out.println(" number is found At "+count);
                flag++;
                break;
            }
            temp=temp.nextNode;
        }

        if(flag == 1)
        {
            removeData(count);
        }
        else
        {
            addItem(s);
            System.out.println("After Adding a List ");
            display();
        }
    }

    /**
     * removeWord From a Linked lIst
     * @param count
     */
    void removeData(int count)
    {
        Node temp = start;
        if(count==1)
        {
            start =start.nextNode;
            System.out.println("After Deleting List is ");
            display();
        }
        else
        {
			for(int i=0;i<count-1;i++)
			{
			 	temp=temp.nextNode;
			}
        temp.nextNode =temp.nextNode.nextNode;
        System.out.println("After Deleting List is ");
        display();
        }
    }

    //main
    public static void main(String[] args)
    {
        OrderedLinkedList obj = new OrderedLinkedList();
        obj.getDataFromFile();
        obj.display();
        obj.size();
       	obj.searchData();
    }
	

}
