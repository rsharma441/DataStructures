

public class BinaryTree {

	public BinaryNode root;
	
	
	
	
	public BinaryTree(){
		root = null;
	}
	
	
	
	
	public void print(){
		root.print();
	}
	
	
	
    public void insert(Segment x){
        
        if(root == null){
        	BinaryNode v = new BinaryNode();
        	v.data = x;
        	root = v;
        }
        else{
            root.insert(x);
        }
    }
}