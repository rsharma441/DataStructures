import java.io.*;


/*
class ReadSegments {
	   public static void main(String args[]) throws IOException
	   {
	      FileInputStream in = null;
	      FileOutputStream out = null;

	      try {
	         
	         FileReader filereader = new FileReader("LineSegment.txt");
	         BufferedReader bufferedreader = new BufferedReader(fileraeder);
	         String line = bufferedreader.readLine();
	         //While we have read in a valid line
	         
	         int[][] segments = new int[4][10] 
	         while (line != null) {
	        	 
	        	 //check to increase the array 
	        	 
	        	 if(line.length()==1){
	        		 
	        	 }
	        	 else{
	        		 
	        		
	        	 }
	        	 
	   
	        
	         
	         
	         
	         
	         }
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	   }
	}

*/


public class driver {
	
	
	
	
	public static void main(String[] args){
		
	
	
		BST traptree = new BST();
		
		//pts each 2 is a segment
		Point pt1 = new Point(0,.023);
		Point pt2 = new Point(1,.023);
		Point pt3 = new Point(0,.55);
		Point pt4 = new Point(1,.3);
		Point pt5 = new Point(.5,1);
		Point pt6 = new Point(1, 0);
		Point pt7 = new Point(0,.1);
		Point pt8 = new Point(1,.9);
		
		//4 segments
		LineSegment s12 = new LineSegment(pt1, pt2);
		LineSegment s34 = new LineSegment(pt3, pt4);
		LineSegment s56 = new LineSegment(pt5, pt6);
		LineSegment s78 = new LineSegment(pt7, pt8);
		
		
		
		//Inserting 
		traptree.insertSeg(s12);
		traptree.insertSeg(s34);
		traptree.insertSeg(s56);
		traptree.insertSeg(s78);
		
		
		traptree.printTree(traptree.root);
		
		
		//Queries 
		

		
		
		
		
		
		
	
	
	}
	
	
	
	
	
	
	
	

	
	
	
	
	

}
