
public class Point {

	double x;
	double y;
	
	public Point(double a, double b){
		x=a;
		y=b;
	}
	
	
//Taken from the assignment page. 
	public static int ccw(Point p0, Point p1, Point p2){
	
		
		
		int COUNTERCLOCKWISE = 0;
		int CLOCKWISE = 1;
		int COLLINEAR = 2;
		
		double dx1 = p1.x - p0.x;
		double dy1 = p1.y - p0.y;
		
		double dx2 = p2.x - p0.x;
		double dy2 = p2.y - p0.y;
		
		if (dx1 * dy2 > dy1 * dx2)
			return COUNTERCLOCKWISE;
		
		if (dx1 * dy2 < dy1 * dx2)
			return CLOCKWISE;
		
		if ((dx1 * dx2 < 0) || (dy1*dy2 < 0))
			return CLOCKWISE;
		
		if ((dx1*dx1 + dy1*dy1) < (dx2*dx2 + dy2*dy2))
			return COUNTERCLOCKWISE;
		
		return COLLINEAR;
	}

}