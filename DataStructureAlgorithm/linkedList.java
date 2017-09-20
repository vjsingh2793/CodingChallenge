/* Creating class with the name Node 
 * Containing key as an integer which holds the data
 * Head of type Node
 */
class Node {
	protected int key;
	protected Node link;
	
	//Constructor to initialize the node
	public Node()
	{
		key=0;
		link=null;
	}
	
	
	//Constructor to initialize the node
	public Node(int key)
	{
		this.key=key;
	}
	
	//Function to get the key
	public int getKey(Node node)
	{
		return node.key;
	}
	
	//Function to get the link
	public Node getLink(Node node)
	{
		return node.link;
	}
	
	//Function to set the key
	public void setKey(int key)
	{
		this.key=key;
	}
	
	//Function to set the link
	public void setLink(Node link)
	{
		this.link=link;
	}
}

public class linkedList
{
	protected Node head;
	protected Node tail;
	int size;
	public linkedList()
	{
		head=null;
		tail=null;
		size=0;
	}
	
	//add the node at the end
	public void addNodeAtEnd(Node a)
	{
		if(head==null)
		{
			tail=head=a;
		}
		else
		{
			tail.link=a;
			tail=a;
		}
	}

	//add the node at the beginning
	public void addNodeAtBeg(Node a)
	{
		if(head==null)
		{
			tail=head=a;
		}
		else
		{
			a.link=head;
			head=a;
		}
	}
	//Display the linked list
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.key);
			temp=temp.link;
		}
	}
	public static void main(String arg[])
	{
		linkedList a=new linkedList();
		Node e1=new Node(3);
		Node e2=new Node(5);
		Node e3=new Node(6);
		a.addNodeAtBeg(e1);
		a.addNodeAtEnd(e2);
		a.addNodeAtBeg(e3);
		a.display();
		
	}
	
}
