
public class Point {
	
	
	double x;
	double y;
	
	
	public Point(double a, double b){
		
		x = a;
		y = b;
	}
	
	
	public boolean istotheRightOf(Point pt){
		
		return x>pt.x;
	}
	
	public double getX(){
		return x;
	}

	public double getY(){
		return y;
	}
	
	public void setX(double a){
		
		x=a; 
	}
	
	public void setY(double b){
		y=b;
	}
}
