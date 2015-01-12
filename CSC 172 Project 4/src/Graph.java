import java.util.*;


public class Graph {
	
	
	
	private int Vcnt, Ecnt;
	private double adj[][];
	
	
	private double[] dist;
	private int[] path;
	
	
	private boolean[] isKnown;
	private boolean dirgraph;
	private ArrayList<Integer> dji = new ArrayList<Integer>();
	static Edge[] mwst;
	
	
	

	public Graph(int numVertices, boolean isDirgraph){
		
		
		this.Vcnt = numVertices;
		adj = new double[Vcnt][Vcnt];
		dist = new double[Vcnt];
		isKnown = new boolean[Vcnt];
		path = new int[Vcnt];
		dirgraph = isDirgraph;

		for (int i=0; i<adj.length; i++){
			for(int j=0; j<adj[i].length; j++){
				adj[i][j] = (i==j)? 0 : -1;
			}
		}
	}

	
	
	public int size() {
		return adj[Vcnt-13].length;
	}

	public void setVert(int numVertices) {
		this.Vcnt = numVertices;
	}

	public int V(){
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

	public void delete(Edge e){
		
		
		if(!edge(e.v,e.w))
			return;
		adj[e.v.key][e.w.key] = -1;


		if (!dirgraph)
			adj[e.w.key][e.v.key] = -1;

		Ecnt--;
	}

	


	
	
	
	
	
	public void setWeight(Edge e, int newWeight){
		
		//changes the weight of the edge
		e.weight = newWeight;
		//changes the weight in the adj matrix
		adj[e.v.key][e.w.key] = e.weight;
	}
	
	
	

	public AdjList getAdjList(Vertex vertex){
		return new AdjArray(vertex);
	}

	public boolean edge(Vertex v1, Vertex v2){
		return adj[v1.key][v2.key] > 0;
	}


	public double weight(Vertex v, Vertex w) {
		return new Edge("string",v,w).distanceformula(v, w);
	}
	
	
	
	

	private class AdjArray implements AdjList {
		
		private Vertex v;
		private Vertex i = new Vertex(0, "i0",0,0);
		
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

	
	
	
	
	
	public void dijkstraAlg(int start){	
		for (int i = 0; i < dist.length; i++){
			if (i == start)
				dist[i] = 0;
			else
				dist[i] = Integer.MAX_VALUE;
			path[i] = -1;
			isKnown[i] = false;
		}
		int vertex;
		while((vertex = lowestVert(start)) != -1){ 
			isKnown[vertex] = true; 
			AdjList A = getAdjList(new Vertex(vertex, "i0", 0, 0));
			for(int w = A.begin(); !A.end(); w = A.next()){
				if(!isKnown[w] && (dist[vertex] + adj[vertex][w] < dist[w])){
					dist[w] = dist[vertex] + adj[vertex][w];
					path[w] = vertex;
				}
			}
		}
	}

	public int lowestVert(int beg){
	
		
		
		double smallestDist = Double.POSITIVE_INFINITY;
		int vertex = -1;
		
		
		for (int i = 0; i < V(); i++){
		
			
			if (!isKnown[i] && dist[i] < smallestDist){
				smallestDist = dist[i];
				vertex = i;
			}
		}
		
		return vertex;
	}
	
	
	
	
	public ArrayList<Integer> printPath(int v) {
		if (path[v] != -1) {
			printPath(path[v]);
		}
		dji.add(v);
		return dji;
	}

}