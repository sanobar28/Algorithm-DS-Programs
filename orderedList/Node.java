/**
 * Model class contains getters and setters for node data
 */


package orderedList;

public class Node {
	
	public String data1;
	public int data;
	public Node nextNode;

	// constructor
	public Node() {
		this.nextNode = null;
	}

	public void setData(String data1) {
		this.data1 = data1;
		nextNode = null;
	}

	public void setData(int data) {
		this.data = data;
		nextNode = null;
	}
}
