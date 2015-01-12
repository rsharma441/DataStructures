
public class BinaryNode {
	
	 int data; //may not need 
	 public BinaryNode left;
	 public BinaryNode right;
	 public BinaryNode parent;
	 public Point p;
	 public LineSegment segment; 
	 public Region region;
	 

	 public BinaryNode(LineSegment seg){
			segment=seg;
			this.left = null;
			this.right = null;
			this.parent = null;
		}
	 
	 
	 public int getData(){
		 
		 return data;
	 }
	 
	 public boolean isMoreLeft(Point pt){
		 return pt.x < p.x; 
	 }
	 public boolean isAbove(Point pt){
		 int i = Geometry.ccw(segment.leftpt, segment.rightpt, pt);
		 return i<=0;
		 
	 }
}
