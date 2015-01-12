public class LinkedList implements LL{
	
	Node head;
	Node tail;
	
	

	public LinkedList()
	{
		head=null;
	
	
	}

	public boolean isEmpty() {
	    return head == null;
    }

	
	//runtime?
	public void insert(Object x)
	{
		if(head==null)
		{
			head = new Node();
			head.data=x;
		}
		else
		{
		  Node temp = head;
		  while(temp.next!=null)
		  {
		  	temp=temp.next;

		  }
		  temp.next = new Node();
		  temp.next.data =x;
		  tail = temp.next;
		  
		  
		}
	
	}
	
	
	
	  public void printList() 
	 {
	    Node currentnode = head;
	    System.out.print("List: ");
	    while(currentnode != null)
		{
		    System.out.print(currentnode.data + ", ");
			currentnode = currentnode.next;
	    }
	    System.out.println("");
    }

	public boolean lookup(Object x){
	
		Node currentnode = head;
		while( currentnode.next != null)
		{
			return currentnode.data.equals(x);

		}
		return false;
	
	
	
	}


	
	//delete: first, last, and some in between


	public void delete(Object x)
	{

		Node temp = head;
		
		if (temp.data.equals(x))
			head = head.next;
		else temp = temp.next;
  
		while(temp.next!=null)
		{	
			//end
			if(temp.next.next==null && temp.next.data.equals(x))
				temp.next=null;
			else if (temp.next.data.equals(x))
		  		temp.next=temp.next.next;
		  	
		  	temp = temp.next;

		}

		




	}




}