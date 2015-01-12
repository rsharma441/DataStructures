
public class BST {
	
	BinaryNode root;
	
	
	public BST()
	{
		root = null;
	}
	
	public boolean isEmpty(){
		
		return root == null;
	}
	
	

	public void insertSeg(LineSegment s) {
		if (root == null) {		
			root = new BinaryNode(s);
			
		} else {
			root = insert(s, root);
		
		}
	}



	//helper Insert()

	private static BinaryNode insert(LineSegment s, BinaryNode n) {
		if (Geometry.checkIntersect(s, n.segment)) //check that 
		{
			
			if (n.left != null) {
				
				n.left = insert(s, n.left);
			}
			else
				n.left = new BinaryNode(s);

			if (n.right != null) {
				
				n.right = insert(s, n.right);
			}
			else
				n.right = new BinaryNode(s);
		}

		else if (Geometry.ccw(s.leftpt, n.segment.leftpt, n.segment.rightpt) < 0) {
			
			
			if (n.right != null){
				
				n.right = insert(s, n.right);
			}
			else
				n.right = new BinaryNode(s);
		}

		else if (Geometry.ccw(s.leftpt, n.segment.leftpt, n.segment.rightpt) > 0) {
			
			if (n.left != null){
				
				n.left = insert(s, n.left);
			}
			else
				n.left = new BinaryNode(s);
		}
		return n;
	}

	
	public void printTree(BinaryNode current){ //recurisve call. 
		
		
		if(current != null){
			
			
			printTree(current.left);
			System.out.println(current.getData());
			printTree(current.right);
			
		}
	
		
		
		
		
	}
	
}
