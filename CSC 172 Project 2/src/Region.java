
public class Region {
	
	
	public Region next;
	public Region up;
	public Region down;
	public Region end;
	public LineSegment top;
	public LineSegment bottom;
	public Point left;
	public Point right;
	//public BinaryNode correspondingnode
	
	
	
	Region()
	{
		next = null;
		top = null;
		bottom = null;
		left = null;
		right = null;
	}
	
	Region(LineSegment t, LineSegment b, Point l, Point r){
		
		
		top = t;
		bottom = b;
		left = l;
		right = r;
		
	}
	
	 public LineSegment getTop()
	    {
	        return top;
	    }

	    public LineSegment getBottom()
	    {
	        return bottom;
	    }

	    public Point getLeft()
	    {
	        return left;
	    }

	    public Point getRight()
	    {
	        return right;
	    }

	    public void setTop(LineSegment l)
	    {
	        top = l;
	    }

	    public void setBottom(LineSegment b)
	    {
	        bottom = b;
	    }

	    public void setLeft(Point l)
	    {
	        left = l;
	    }

	    public void setRight(Point r)
	    {
	        right = r;
	    }

}
