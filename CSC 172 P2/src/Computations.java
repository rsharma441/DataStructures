
import java.io.*;


public class Computations {
	
	BinaryNode firstNode = new BinaryNode();
	static File f;
	

	
	public static void main(String[] args) throws IOException {
		
		f = new File("outfile.txt");
		fileReader(f);
	
	}
	
	public static void fileReader(File a) throws IOException
    {
           
           String output = "";
           
           BufferedReader br = new BufferedReader(new FileReader("src/infile.txt"));
            
           {
               
               FileWriter f = new FileWriter(a);
               BufferedWriter b = new BufferedWriter (f);
               
               
               //Help from Gabe Issa 
               StringBuilder sb = new StringBuilder();
               String l = br.readLine();
               int linenumber = Integer.parseInt(l);
               sb.append(l + "\n");
               l = br.readLine();
               

               BinaryTree ReadingTree = new BinaryTree();
               
               for(int i = 0; i < linenumber; i++)
               {
                   String[] parts = l.split(" ");
                  
                   ReadingTree.insert(new Segment(new Point(Double.parseDouble(parts[0]), Double.parseDouble(parts[1])), new 
                   Point(Double.parseDouble(parts[2]), Double.parseDouble(parts[3]))));
                 
                   sb.append(l + "\n");
                   l = br.readLine();   
               }
               
               int pointnumber = Integer.parseInt(l)*2;

               
               sb.append(l + "\n");
               l = br.readLine();
               
               
               /*****************************************/
               
               
               Point[] points = new Point[pointnumber];
               
               for(int i = 0; i < pointnumber; i += 2)
               {
                   String[] pointStrings = l.split(" ");
                   points[i] = new Point(Double.parseDouble(pointStrings[0]), Double.parseDouble(pointStrings[1]));
                   points[i+1] = new Point(Double.parseDouble(pointStrings[2]), Double.parseDouble(pointStrings[3]));
                   
                   sb.append(l+ "\n");
                   l = br.readLine();
                   
               }
               
               
               output += "Number_of_leaf_nodes: " + ReadingTree.root.leafCt() + "\n";
               output += "Average_height_of_tree: " + ReadingTree.root.avgHeight() + "\n\n";
               
               for(int i = 0; i < pointnumber; i += 2){
            	   output += (ReadingTree.root.sameRegion(points[i], points[i+1]));
                   output += "\n";
                       
               }
             
               b.write(output);

               br.close();
               b.close();
               
           } 
          
       }

}
