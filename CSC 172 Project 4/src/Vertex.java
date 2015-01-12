public class Vertex {
	
	
	public AdjList adj;
	public boolean isKnown;
	public double dist;
	public int key;
	
	//Path mapping 
	public Vertex preced;
	public double x;
	public double y;
	public String label;
	
	
	

	public Vertex(int key, String label, double x, double y){
		this.key = key;
		this.label = label;
		this.dist =  Double.POSITIVE_INFINITY;
		this.isKnown = false;
		this.preced = null;
		
		

		this.x = x;
		this.y = y;
	}


	public boolean maxDistance(){
		if (dist == Double.POSITIVE_INFINITY)
			return true;
		else
			return false;
	}

	
	public void setKey(int key) {
		this.key = key;
	}

	public boolean isKnown() {
		return isKnown;
	}

	public void setKnown(boolean v) {
		isKnown = v;
	}
	
	

}