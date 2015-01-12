
public class driver {
	
	public static void main(String[] args)
	{
		
		
		//Testing if is empty
		LinkedList ll = new LinkedList();
		if((ll.isEmpty())==true)
		{
			System.out.println("This is empty!");
		}
		
		
		//Adding things
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		ll.insert(6);
		ll.printList();
	
		ll.delete(1);
		ll.delete(5);
		
		ll.printList();
		
		
		
		
		
		
	}
	
	

}
