import javax.swing.*;

import java.awt.*;
import java.awt.geom.Line2D;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Scanner;

public class RoadMap extends JFrame{
        
        static JFrame frame;
        private static int vertCount = 1;
        private static int vertID = 1;
        
        
        
        
        private static Map<String, Vertex> vMap = new HashMap<String, Vertex>(); //string keys, holding vertices
        private static Map<Integer, Vertex> intMap = new HashMap<Integer, Vertex>();
       
        
        private static ArrayList<Edge> mwst = new ArrayList<Edge>();
        
        
        
        
        
        static Graph map = new Graph(0, false); 
        static Scanner s;
        static Edge[] minweightst;  //new MST, most important**** need to move out of Graph Class 
        

        
        
        

        
        private static ArrayList<Integer> path = new ArrayList<Integer>();
        private static Map<String, Edge> edgeMap = new HashMap<String, Edge>();
       private static Map<String, Edge> valEdgeMap = new HashMap<String, Edge>();
       
        
        
        @SuppressWarnings("serial")
		public static void main (String[] args) throws IOException {
                
                try {
                     
               
						BufferedReader graphFile = new BufferedReader(new FileReader("monroe-county.tab"));
                        
                        String line=""; 
                        int counter = 1;
                        
                        
                        while((line = graphFile.readLine()) != null) {
                               
                        	
                        	
                        		StringTokenizer st = new StringTokenizer(line);
                                String id = st.nextToken();
                                
                                //intersections as vertices
                                if (id.equals("i")) {
                                        String ID = st.nextToken();
                                double x = Double.parseDouble(st.nextToken());
                                double y = Double.parseDouble(st.nextToken());
                                        
                                        
                                        
                            Vertex v = vMap.get(ID);
                              
                                // there is no vertex there.
                                if (v == null) {
                                	
                    
                                        v = new Vertex(vertID, ID, x, y);
                                       
                                        
                                        
                                        vMap.put(ID, v);
                                        intMap.put(vertID, v);
                                        
                                        
                                        
                                        vertCount = vertID++;
                                }
                        } 
                     
                           if (vertID == counter) //the vertID is equal to the number of lines currently 
                                        map = new Graph(vertCount+1, false);
                                        
                                else if (id.equals("r")) {        
                                       
                                	
                                	
                                	String ID = st.nextToken();
                                        
                                	
                                	
                                		String s1 = st.nextToken();
                                        String s2 = st.nextToken();
                                       
                                        
                                        
                                        
                                        Vertex v1 = vMap.get(s1);
                                        Vertex v2 = vMap.get(s2);
                                        
                                        
                                        
                                        Edge e = new Edge(ID, v1, v2);
                                        e.setID(ID);
                                        
                                        
                                        edgeMap.put(ID, e);
                                        mwst.add(e);
                                        map.insert(e);
                                        valEdgeMap.put((s1+"|"+s2), e);
                                        
                                        
                                }
                                counter++;
                        }
                        
                } catch (FileNotFoundException e) {
                
                        e.printStackTrace();
                }
                
                
                
                //UI
                s = new Scanner(System.in);
                System.out.println("Please enter the starting point: ");
                String start = s.next();
                
                map.dijkstraAlg(vMap.get(start).key);
                System.out.println("Please enter the destination point: ");
                
                String destination = s.next();
                path = map.printPath(vMap.get(destination).key);
                
                
                
                //create MWST
                minweightst= listToArray(mwst);
                mst();
                final ArrayList<Edge> drawMST = makeMST();
                
                        
                
                
                //display
                for (int i = 0; i < path.size(); i++) {
                	System.out.print("Intersection: " + intMap.get(path.get(i)).label);
                	if (i != path.size()-1)
                		System.out.print(" --> ");
                }
                System.out.println();
                for (int i = 0; i < path.size()-1; i++) {
                	
                	
                	if (valEdgeMap.get((intMap.get(path.get(i)).label+"|"+intMap.get(path.get(i+1)).label)) != null)
                		System.out.print("Roads: " + valEdgeMap.get((intMap.get(path.get(i)).label+"|"+intMap.get(path.get(i+1)).label)).getID());
                	else
                		System.out.print("Roads: " + valEdgeMap.get((intMap.get(path.get(i+1)).label+"|"+intMap.get(path.get(i)).label)).getID());
                	if (i != path.size()-2)
                		System.out.print(" , ");
                }
                
                System.out.println("");
                System.out.println("The number of intersections is:" + intMap.size());
                System.out.print("The number of roads is:" + path.size());
                
                
                
                ///Graphics
                RoadMap sm = new RoadMap();
                sm.add(new JComponent() {
                	
                	
                	
                        public void paintComponent(Graphics g) {
                        	
                        	
                        	
                                Graphics2D g2 = (Graphics2D) g;
                                super.paintComponent(g2);
                                g2.setBackground(Color.BLACK);
                                g2.setColor(Color.BLACK);
                                
                               Iterator nextEdge = edgeMap.entrySet().iterator();
                                
                                
                                
                             //CREATE LINE
                                while(nextEdge.hasNext()) {
                                	
                                	
                                        Map.Entry pair = (Map.Entry) nextEdge.next();
                                        Edge e = (Edge) pair.getValue();
                                        Shape line = new Line2D.Double(e.v.x, e.v.y, e.w.x, e.w.y);
                                        
                                        
                                        
                                        g2.draw(line);
                                        
                                        nextEdge.remove();
                                }
                                
                                
                                //DRAW ROADS
                                g2.setColor(Color.GREEN);
                                for (Edge e : drawMST) {
                                	Edge edges = e;
                                        Shape line = new Line2D.Double(edges.v.x, edges.v.y, edges.w.x, edges.w.y);
                                        g2.draw(line);
                                }
                                
                                
                                //DRAW PATH
                                g2.setColor(Color.RED);
                                if (path.size() > 1) {
                                        for (int i = 0; i < path.size()-1; i++) {
                                                Shape line = new Line2D.Double(intMap.get(path.get(i)).x, intMap.get(path.get(i)).y, intMap.get(path.get(i+1)).x,intMap.get(path.get(i+1)).y);
                                                g2.draw(line);
                                        }
                                }
                        }
                });
                
                
                //CLOSE
                sm.setDefaultCloseOperation(EXIT_ON_CLOSE);
                sm.setSize(800, 800);
                sm.setVisible(true);
                
                
        }
        
        
        
        //takes list of Edges and turns it into an Array of Edges 
        public static Edge[] listToArray(ArrayList<Edge> list) {
        	
        	
        	
        	Edge[] tree = new Edge[list.size()];
        	
        	
        	
                for (int i = 0; i < list.size(); i++) {
                        tree[i] = list.get(i);
                }
                return tree;
        }
        
        
        
        
        
        
        //Calculates the MST
        public static void mst() {
        	
        	
                for (int i = 0; i < minweightst.length; i++) {
                       
                	
                	
                		double min = minweightst[i].weight;
                        int minCheck = i;
                        
                        
                        for (int j = i+1; j < minweightst.length; j++) {
                               
                        	
                        	if ((double) minweightst[j].weight < min) {
                                        min = minweightst[j].weight;
                                        minCheck = j;
                                }
                        }
                        if (minCheck != i) {
                        	
                        	
                        		Edge e = minweightst[minCheck];
                                minweightst[minCheck] = minweightst[i];
                                minweightst[i] = e;
                        
                        }
                }
        }
        
        
        
        
        
        
        
        
        
        
        
        //creat the MST
        public static ArrayList<Edge> makeMST() {
        	
        	
                ArrayList<Edge> list = new ArrayList<Edge>();
                
                
                
                for (int i = 0; i < minweightst.length; i++) {
                        if (!minweightst[i].isVisited()) {
                                list.add(minweightst[i]);
                                minweightst[i].setVisited();
                        }
                }
                return list;
        }
        
        
        
        
        
        
        
        
        
     
}