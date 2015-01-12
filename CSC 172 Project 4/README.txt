RISHI SHARMA
CSC 172
PROJECT 4 
DOWNEY


OBJECTIVE: This project was designed to test our previous ADT implementation of the graph, our Dijkstra's algorithm, and how we created a MWST. 
The file is formatted as specified in the instructions and each fileis read.
Then vertexes and edges are created and inserted to create a graph.  
Originally, I stored the values all in a list, but I found it much more efficient to
use a HashTable. Eventually, it seemed even easier to use a HashMap and use String inputs as keys.
My file IO for inputting the start and end destinations wasnt working well, so I used a Scanner. 

The graphics display a map of Rochester where a RED line shows the shortest path from A to B.




RUNTIME ANALYSIS: 
Dijkstra's runs in O(n^2)
Overall, the program runs in O(n^2) time. 


FILES:
AdjList.java
Edge.java
Graph.java
RoadMap.java
Vertex.java



COMPILE INSTRUCTIONS:
javac RoadMap.java


RUN INTRUCTIONS: -Xmx2048m RoadMap

**I increased the HeapSize for Eclipse since I was coding in eclipse, but I think you can use a flag to increase the Heap Size. 