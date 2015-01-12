
public class LineSegment {
	
	
	public Point leftpt;
	public Point rightpt;
	
	
	public LineSegment(Point p1, Point p2){
		
		if(p1.x > p2.x ){
			rightpt = p1;
			leftpt = p2;
			
		}
		else if(p1.x < p2.x){
			leftpt = p1;
			rightpt = p2;
			
		}else if(p1.y < p2.y){
			leftpt = p1;
	         rightpt = p2;
	         return;
	        } else
	        {
	            leftpt = p2;
	            rightpt = p1;
	            return;
	        }
			
			

	}
	
	
	public Point returnStart(){
		return leftpt;
	}
	
	public Point returnEnd(){
		return rightpt;
	}
	
	
	


}
