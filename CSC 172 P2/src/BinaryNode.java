public class BinaryNode {
	
	
	
	
	public int leafcount = 0;
    public double SumCt = 0;

	public BinaryNode left;
	public BinaryNode right;
	public Segment data;
	public int height;
	
	
	
	
	
	public BinaryNode(){
		
		this.left = null;
		this.right = null;
		this.data = null;
		this.height = 0;
	}
	
	
	
	
	public void insert(Segment s){
	    
        if(Segment.intersects(s, this.data)){
            Lines lset = s.splitLine(this.data);
            this.insert(lset.first);
            this.insert(lset.second);
        }
    
        if (s.isLeftOf(this.data)){
        
            if(left == null){
            	BinaryNode newNode = new BinaryNode();
                left = newNode;
                
                
                newNode.data = s;
                newNode.height = height + 1;
            }
            else{
                left.insert(s);
            }
        }
    
        if (s.isRightOf(data)){
        
            if(right == null){
            	BinaryNode newNode = new BinaryNode();
                right = newNode;
                
                
                newNode.data = s;
                newNode.height = height + 1;
            }
            else{
                right.insert(s);
            }
        }
    }
	
	
	   public String sameRegion(Point a, Point b){
	    	if (comparePoints(a, b).equals(""))
	    		return ("The points are in the same region");
	    	
	    	else 
	    		return comparePoints(a, b);
	    }
	    
	    
	

	//Done with the assistance of Ethan Lipkind and Gabe Issa
	public String comparePoints(Point a, Point b){
	       
	        
	        String result = "";
	        int aDirection;
	        int bDirection;
	        aDirection = Point.ccw(this.data.left, this.data.right, a);
	        bDirection = Point.ccw(this.data.left, this.data.right, b);
	        
	     
	        
	       if(aDirection != bDirection){
	        
	         if(this.data.parent != null){
	                   result += ("Points " + "(" + a.x + ", " + a.y + ") " + "and " + "(" + b.x + ", " + b.y + ") are separated by line described by the points " + "(" + this.data.parent.left.x + ", " + this.data.parent.left.y + ")" + "(" + this.data.parent.right.x + ", " + this.data.parent.right.y + ")\n");
	                   if(left != null){
	                       result += left.comparePoints(a, b);
	                   }
	                   if(right != null){
	                       result += right.comparePoints(a, b);
	                   }
	            
	            }
	            
	         else{
	                   result += ("Line " + "(" + this.data.left.x + ", " + this.data.left.y + ")" + "(" + this.data.right.x + ", " + this.data.right.y + ") separates the regions containing the pts. \n");
	                   if(this.left != null){
	                       result += left.comparePoints(a, b);
	                   }
	                   if(this.right != null){
	                       result += right.comparePoints(a, b);
	                   }
	            }
	        }
	        
	       if(aDirection == bDirection){
	        
	    
	          if(aDirection == 0) {
	                if(this.left != null){
	                	result += this.left.comparePoints(a, b);
	                }
	            }
	            
	            if(aDirection == 1) {
	            
	                if(this.right != null){
	                    result += this.right.comparePoints(a, b);
	                }
	            }
	        
	        }
	        else{}
	        
	        
	        return result;

	    }
	
    
    
    
    public int leafCt(){
        
        if(this.left == null && this.right == null){
        	leafcount++;
        }
        
        if(this.left != null){
        	leafcount += this.left.leafCt();
        }
        
        if(this.right != null){
        	leafcount += this.right.leafCt();
        }
        
        return leafcount;
        
    }
   
    
    
    
    public double sumOfHeights(){
        
        if(this.left == null && this.right == null){
            SumCt += this.height;
        }
        
        if(this.left != null){
            SumCt += this.left.sumOfHeights();
        }
        
        if(this.right != null){
            SumCt += this.right.sumOfHeights();
        }
        
        return SumCt;
    }
    
    
    
    
    public double avgHeight(){
    	
    	
          
    	return sumOfHeights()/leafcount;
    }
    
    
    
    public void print() {
		if (left != null)
			left.print();

		System.out.println(data.left.x + " " + data.left.y + " " + data.right.x + " " + data.right.y);

		if (right != null)
			right.print();
	}
    
    
}
