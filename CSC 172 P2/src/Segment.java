

public class Segment {
	
	
	Point left;
	Point right;
	
	
	double slope;
	double intercept;
	Segment parent;
	
	public Segment(Point left, Point right){
   	
    	this.left = left;
        this.right = right;
        this.slope = ((right.y - left.y) / (right.x - left.x));
        this.intercept = left.y - (slope * left.x);
        this.parent = null;
    }
    
	
	
	
    public Lines splitLine(Segment seg){
    	
    	
    	Segment leftbased = new Segment(this.left, POI(this, seg));
    	leftbased.parent = this;
    	
        Segment rightbased = new Segment(POI(this, seg), this.right);
        rightbased.parent = this;
        
        Lines returnLines = new Lines(leftbased, rightbased);
        return returnLines;
    }
    
    
    
    
    
    
    public static Point POI(Segment s1, Segment s2){
      
    	
    	double ix, iy;
        
        ix = (s1.intercept-s2.intercept)/(s2.slope-s1.slope);
        
        iy = ix * s1.slope + s1.intercept;
        
        
        Point PointOfIntersection = new Point(ix, iy);
        
        return PointOfIntersection;
    }
    
    
    
    
    
    
	public static boolean intersects(Segment a, Segment b){
		
		
		
		
	
		if (((a.left.x < POI(a, b).x && a.right.x < POI(a, b).x)
				|| (a.left.x > POI(a, b).x && a.right.x > POI(a, b).x)) || ((b.left.x < POI(a, b).x && b.right.x < POI(a, b).x) || b.left.x > POI(a, b).x && b.right.x > POI(a, b).x)){
			return false;
		}

		if (a.slope == b.slope){
			return false;
		}
		
		if((b.left.x == POI(a, b).x && b.left.y == POI(a, b).y) 
				|| (b.right.x == POI(a, b).x && b.right.y == POI(a, b).y)){
			return false;
		}
		
		if((a.left.x == POI(a, b).x && a.left.y == POI(a, b).y) 
				|| (a.right.x == POI(a, b).x && a.right.y == POI(a, b).y)){
			return false;
		}
				
		else
			return true;
	}
	
	
	
	public boolean isLeftOf(Segment seg){

		if (intersects(this, seg))
    		return false;
		
		
		if(!intersects(this, seg)){
			
			
			
			if (Point.ccw(seg.left, seg.right, this.left) == 0 && Point.ccw(seg.left, seg.right, this.right) == 0)
				return true;
			if (Point.ccw(seg.left, seg.right, this.left) == 0 && Point.ccw(seg.left, seg.right, this.right) == 2)
				return true;
			if (Point.ccw(seg.left, seg.right, this.left) == 2 && Point.ccw(seg.left, seg.right, this.right) == 0)
				return true;
			else
				return false;
		
		
		
		
		}
		else{}
			return false;
	}
	
	
	
    public boolean isRightOf(Segment seg){

    	if (intersects(this, seg))
    		return false;
    	
    	
    	
    	if(!intersects(this, seg)){
    		
    		
	        if (Point.ccw(seg.left, seg.right, this.left) == 1 && Point.ccw(seg.left, seg.right, this.right) == 1)
	            return true;
	        if (Point.ccw(seg.left, seg.right, this.left) == 1 && Point.ccw(seg.left, seg.right, this.right) == 2)
	        	return true;
	        if (Point.ccw(seg.left, seg.right, this.left) == 2 && Point.ccw(seg.left, seg.right, this.right) == 1)
	        	return true;
	        else
	            return false;
	    	}
    	else{}
			return false;
	}
}