public class Edge {
	
	Vertex v;
	Vertex w;
	double weight;
	
	String id;

	public Edge(String id, Vertex v, Vertex w){
		
		this.v = new Vertex(v.key, v.label, v.x, v.y);
		this.w = new Vertex(w.key, w.label, w.x, w.y);
		
		this.weight = distanceformula(v,w);
		this.id = id;
	}

	
	public String getID() {
		return this.id;
	}

	
	public void setID(String id) {
		this.id = id;
	}


	public double distanceformula(Vertex v, Vertex w) {
		
		//this takes the distance formula between the x and y locations of each Vertex
		return Math.pow(Math.pow((w.x-v.x), 2) + Math.pow((w.y - v.y), 2), 0.5);
	}
	
	public boolean isVisited() {
		return (v.isKnown() && w.isKnown());
	}
	
	public void setVisited() {
		v.setKnown(true);
		w.setKnown(true);
	}

	
}