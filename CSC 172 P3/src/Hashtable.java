import java.util.*;

public class Hashtable {

	LinkedList[] ht;
	int tablesize;
	int nodesct;
	
	
	
	Hashtable(int ts){
		
		tablesize = ts;
		ht = new LinkedList[tablesize];
		
	}
	
	
	public int hash(String s){
	  
		long x = tablesize;
		for( int i=0; i <s.length(); i++)
			x=31*x+s.charAt(i);
		
		return (int)(x%tablesize);
			
	}
	
	
	public void insert(String s){
		
		int key = hash(s);
		
		if(ht[key]==null){
			
			ht[key] = new LinkedList();
			ht[key].add(s);
			nodesct++;
			
		}
		
		
	}
	
	public void delete(String s){
		
		int key = hash(s);
		if(ht[key] !=null){
			if(ht[key].remove(s))
				nodesct--;
		}
		
		
	}
	
	public boolean lookup(String s){
		
		int key = hash(s);
		if(ht[key] !=null){
			return ht[key].contains(s);
			
		}
		else
			return false;
	
	}
	
	
	public boolean isEmpty(){
		if(nodesct<=0)
			return true;
		else
			return false;
		
	}
	
	
	
	
	
		
		
}
	
	
	
