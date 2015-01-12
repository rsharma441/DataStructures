
public class Heap implements MyHeap{
	
	int maxsize;
	int currentsize;
	int[] heap = new int[maxsize];
	
	
	public Heap(){
		
		currentsize=0;
		maxsize = 10;
		
	}

	
	public int size(){
		
		return currentsize;
	}
	
	public boolean isEmpty(){
		
		return currentsize==0;
	}
	

	public void insert(int item){
		
		
		
		heap[currentsize] = item;
	
		int parentIndex = (int)Math.floor(currentsize/2);
		
		while(item<heap[parentIndex])
		{
			bubbleUp(currentsize);	
		}
			
		
		currentsize++;
	
	}
		

		
	
	
	
	public void bubbleUp(int index){
		
		//figure out the problem
		// has the problem
		
		int temp = heap[index/2];
		heap[index/2]=heap[index];
		heap[index]=temp;
			
		
			
		
		
		
		
	}
	public int deleteMin(){
		return heap[0];
		
			
	}
	
	public void printheap(){
		
		System.out.print(heap[0]);
		for(int i = 1; i<heap.length; i++)
			System.out.print(", " + heap[i]);
		
	}

}
