
public class Graph {

	private  int Vcnt;
	private int Ecnt; //counts
	boolean dirgraph;
	private double adj[][];
	static Vertex[] vertices = new Vertex[50];
	
	 boolean visited[];
	 double distance[];
	 int path[];
	
	
	
public Graph(int numVertices, boolean isDirgraph ){
		
		Vcnt=numVertices;
		dirgraph=isDirgraph;
		adj = new double[Vcnt][Vcnt];
		visited = new boolean[Vcnt];
		distance = new double[Vcnt] ;
		path = new int[Vcnt];
		
	}
	
	public static void main(String[] args){
		
		
		
	}
	
	
	
	

	public boolean directed(){
		return dirgraph;
		
	}
	
	public  int V(){
		
		return Vcnt;

		
	}
	
	public int E(){
	
		return Ecnt;
		
	}
	
	public void insert(Edge e){
		
		
		if (edge(e.v, e.w))
			return;
		adj[e.v.key][e.w.key] = e.weight;
		Ecnt++;

		if (!dirgraph){
			adj[e.w.key][e.v.key] = e.weight;
		}
				
		}
	
			
// end insert
	
	public void delete(Edge e){
		
		
		if(!edge(e.v,e.w))
			return;
		adj[e.v.key][e.w.key] = -1;


		if (!dirgraph)
			adj[e.w.key][e.v.key] = -1;

		Ecnt--;
			
	} //end delete
		
	

	
	
	
	public boolean edge(Vertex node1, Vertex node2){ //are they connected from 1 to 2
			
		return adj[node1.key][node2.key]>0;
	} //end edge
	
	
	
	class Edge{
		
		Vertex v,w;
		double weight;
		
		public Edge(Vertex v, Vertex w, int weight){
			this.v = new Vertex(v.key);
			this.w= new Vertex(w.key);
			this.weight = weight;
			
		}
		
		
		public void setVertVisited() {
			v.setKnown(true);
			w.setKnown(true);
		}

		public boolean isVertVisited() {
			return (v.isKnown() && w.isKnown());
		}
		
		
	}
	
	public AdjList getAdjList(Vertex v){
		
		return new AdjArray(v);
	}






	private class AdjArray implements AdjList{
		
		private Vertex v;
		private Vertex i = new Vertex(0);
		
		AdjArray(Vertex v){
			this.v = v;
			i.setKey(-1);
		}
	
		public int next(){
			for(i.key++;i.key<V();i.key++){
				if(edge(v,i)){
					return i.key;
				}
			}
			return -1;
		}
		public int begin(){
			i.setKey(-1);
			return next();
		}
		public boolean end(){
			if (i.key < V())
				return false;
			return true;
		}
	
	}

	
	static void show(Graph G){
		
		for(Vertex s= new Vertex(0); s<G.V()+1; s++){
			System.out.print(s+ ": ");
			AdjList A=G.getAdjList(s);
			for(int t = A.begin(); !A.end(); t = A.next()){
				System.out.print(t+" ");
			}
			System.out.println();
		}
	}

	
	
	
	

	
	
	

	public void dijkstra(int start){	
		
		
		
		for (int i = 0; i < distance.length; i++){
			distance[i] = (i == start) ? 0 : Integer.MAX_VALUE;
			path[i] = -1;
			visited[i] = false;
		}
		
		
		int vertex;
		while((vertex = lowestVertex(start)) != -1){ 
			
			visited[vertex] = true; 
			AdjList A = getAdjList(new Vertex(vertex));
			for(int w = A.begin(); !A.end(); w = A.next()){
				if(!visited[w])
					if (distance[vertex] + adj[vertex][w] < distance[w]){
					distance[w] = distance[vertex] + adj[vertex][w];
					path[w] = vertex;
				}
			}
		}
	}

	public int lowestVertex(int start){
		double smallestDist = Double.MAX_VALUE;
		int vertex = -1;
		for (int i = 0; i < V(); i++){
			if (!visited[i] && distance[i] < smallestDist){
				smallestDist = distance[i];
				vertex = i;
			}
		}
		return vertex;
	}
}
