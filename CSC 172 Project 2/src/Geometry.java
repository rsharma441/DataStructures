
public class Geometry {
	
	

	public Geometry(){
	
	}
	
	
	
	 public boolean isAbove(Point point, Point vertice1, Point vertice2)
	    {
	        int i = ccw(point, vertice1, vertice2);
	        return i < 0;
	    }
	
	 public static int ccw(Point p1, Point p2, Point p3)
	    {
	        int result = 0;
	        double dx1 = p2.getX() - p1.getX();
	        double dy1 = p2.getY() - p1.getY();
	        double dx2 = p3.getX() - p1.getX();
	        double dy2 = p3.getY() - p1.getY();
	        if(dx1 * dy2 > dy1 * dx2)
	            result = 1;
	        if(dx1 * dy2 < dy1 * dx2)
	            result = -1;
	        if(dx1 * dy2 == dy1 * dx2)
	            if(dx1 * dx2 < 0 || dy1 * dy2 < 0)
	                result = -1;
	            else
	            if(dx1 * dx1 + dy1 * dy1 >= dx2 * dx2 + dy2 * dy2)
	                result = 0;
	            else
	                result = 1;
	        return result;
	    }
	 
	 
	 
	 public void setVertical(Region left, Region right, LineSegment s){
			
			if(left != null){
				
				double d;
			}
			
		}
	 
	 
	 
	 
	 public boolean checkInstersection(LineSegment s1, LineSegment s2)
	    {
	        int a = ccw(s1.returnStart(), s1.returnEnd(), s2.returnStart());
	        int b = ccw(s1.returnStart(), s1.returnEnd(), s2.returnEnd());
	        int c = ccw(s2.returnStart(), s2.returnEnd(), s1.returnStart());
	        int d = ccw(s2.returnStart(), s2.returnEnd(), s1.returnEnd());
	        return (a * b < 0) && (c * d < 0) || (a * b * c * d == 0);
	    }

	 
	 
	 

		public static Point Intersects(LineSegment s1, LineSegment s2){

			//Segment 1 
			double x1 = s1.leftpt.x;
			double y1 = s1.leftpt.y;
			double x2 = s1.rightpt.x;
			double y2 = s1.rightpt.y;

			//Segment 2 
			double x3 = s2.leftpt.x;
			double y3 = s2.leftpt.y;
			double x4 = s2.rightpt.x;
			double y4 = s2.rightpt.y;


			//Cross NEED TO PARAPHRASE 
			double d = ((x1-x2)*(y3-y4)) - ((y1-y2)*(x3-x4)); 
			if (d == 0) return null; 


			
			double x_alpha = ((x3-x4)*(x1*y2-y1*x2)-(x1-x2)*(x3*y4-y3*x4))/d;
			double y_alpha = ((y3-y4)*(x1*y2-y1*x2)-(y1-y2)*(x3*y4-y3*x4))/d;

			if (x3==x4) { 
				if (y_alpha < Math.min(y1,y2) || y_alpha > Math.max(y1,y2))
					return null; 
			} 
			Point p = new Point(x_alpha,y_alpha);

			if (x_alpha < Math.min(x1,x2) || x_alpha > Math.max(x1,x2)) 
				return null; 

			if (x_alpha < Math.min(x3,x4) || x_alpha > Math.max(x3,x4)) 
				return null;

			return p;
		}

		
		public static boolean checkIntersect(LineSegment s1, LineSegment s2){
			if (Intersects(s1, s2) == null) { 		
				return false;
			}
			else
				return true; 
		}	
	 
	 
}
