
public class MyDLL implements MyDoubleLinkedList {
	
	private MyDoubleNode head;
	private MyDoubleNode tail;

	public MyDLL()
	{
		head = new MyDoubleNode();
		tail = new MyDoubleNode();
		head.next=tail;
		tail.prev=head;
		head=null;
		tail=null;
		
	}
	
	
	
	public boolean isEmpty() {
		
		return head == null;
		
	}
	
	
	
	public void insert(Object x)
	{
		MyDoubleNode newnode = new MyDoubleNode();
		newnode.data = x;
		
		
		
		if(head==null)
		{
			head = newnode;
		}
		else if (head == null && tail != null)
		{
			tail = newnode;
		}
		else
		{
			tail.next = newnode;
			newnode.prev = tail;
			

		}
		  
		tail = newnode;
		  
		  
		  
	}
		
		
	
	public boolean lookup(Object x){
		
		MyDoubleNode current = head;
		
		if(current.next.next!=null)
		{
			while(current.data.equals(x)==false)
		
			{
				current=current.next;
							
			}
			
			return current.data == x;
			
		}
		else
		{
			return false;
		}
	}
	
	
	public void delete(Object x)
	{
		MyDoubleNode current = head;
		
		
		//delete the head
		if(head.data == x)
		{
			head = head.next;
			
		}
		else 
		{
			current = current.next; //if the x is not the head
			
			while (current.data.equals(x)==false)//find x 
			{
				current=current.next;
				
			}
			
			
			
			
			if(current == null)
			{
				System.out.println("This item is not in the list.");
			}
		}
		
		
		
	}
	
	
	public void printList(){
		
		MyDoubleNode current = head;
    	System.out.print("List: ");
    	while(current != null)
		{
	    	System.out.print(current.data + ", ");
			current = current.next;
    	}
   
   		 System.out.println("");

	}

		
	
	
	public void printListRev(){
		
		MyDoubleNode current = tail;
    	System.out.print("List In Reverse: ");
    	while(current != null)
		{
	    	System.out.print(current.data + ", ");
			current = current.prev;
    	}
   
   		 System.out.println("");
		
		
	}







}
