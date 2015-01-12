import java.util.*;
import java.io.*;



public class WordSearcher {
	
	
	int length = 0; //length of the line (also width)
	Hashtable h = new Hashtable(479833); //determine hashtable size 
	ArrayList<String> searchresults = new ArrayList<String>();
	char[][] ws;
	int count;
	
	
	
	
	public static void main(String[] args){
		
		String dictionary = "dictionary.txt";
		String puzzle = "input.txt";
		String puzzle2 ="unawntraeart\nrwaterdlrowr\navbtrvkeyaue\ntomvreianxiz\nearauseinizr\nlpvlacmipsyi\nclnieahynkgl\nyaaolrxazbry\ncnesceeonyez\netlbjcroqgna\nrschonhtraeg\nnoitavresnoc";
		WordSearcher ws = new WordSearcher();
		ws.createDict(dictionary);
		ws.createPuzzle2(puzzle2);
		
		ws.search();
		

	}
	
	
	
	public void createPuzzle2(String puzzle){
		
		
		String[] puzzlesplit = puzzle.split("\n");
		char[][] endarray = new char[puzzlesplit.length][puzzlesplit.length];
		
		for(int i = 0; i<puzzlesplit.length;i++){
			for(int j=0; j<puzzlesplit[i].length(); j++){
				
				endarray[i][j]=puzzlesplit[i].charAt(j);			
				
			}		
			
			
		}		
		
		
	}
	

	public void createPuzzle(String puzzle){
		
		String line;
		BufferedReader in;	
		
		File puz = new File(puzzle);
		
		try {
			
			
			in = new BufferedReader(new FileReader(puz));
			line=null;
			int i = 0;
			
			
			while ((line = in.readLine()) != null) {
				if (length == 0) {
					
					
					length = line.length();
					ws = new char[length][length];
				}
				for (int j = 0; j < line.length(); j++)
					ws[i][j] = line.charAt(j);
				i++;
			}
			
			
			in.close();
		} 
		
		catch (IOException e) {
			System.err.format("IOException: Puzzle");
		}
		
		
	}
		
	
	
	public void createDict(String list) {
		
		String word;
		BufferedReader in;
		
		File dict = new File(list);
		
		try { 
			
			
			in = new BufferedReader(new FileReader(dict));
			word = null;
			
			while ((word = in.readLine()) != null)
				h.insert(word);
			in.close();		
			
		} 
		
		catch (IOException e) {
			System.err.format("IOException: Dictionary");
		}
	}
	
	
	
	
	public void search(){
	
		
		//check the surrounding letters 
		for(int i=0; i<length; i++){
			for(int j=0; j<length; j++){
				
				searchsurroundings(j, i);		
				
			}
		}
		
		
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
			for (String r : searchresults) {
				out.write(r);
				out.newLine();
			}
			out.write("There are " +count+ " words found.");
			out.close();
		}
		catch (Exception e) {
			System.err.println("Error writing files");		
		
	}
		
		

		
	}
	
	public void searchsurroundings(int x, int y){
		
		
		//northwest direction
		String nw = "";
		
		for(int i=0;(x-i >= 0 && y-i >= 0); i++){
			nw+= ws[y-i][x-i];
			if (h.lookup(nw))
				if (!searchresults.contains(nw.toLowerCase())) {
					searchresults.add(nw.toLowerCase()); 
					count++;				}
		}
		
		
		//north direction
		String n = "";

		for(int i=0;x-i >= 0; i++){
			n+= ws[y][x-i];
			if (h.lookup(n))
				if (!searchresults.contains(n.toLowerCase())) {
					searchresults.add(n.toLowerCase()); 
					count++;
				}
		}
		
		
		//northeast direction
		String ne = "";

		for(int i=0;(x+i < length && y-i >= 0); i++){
			ne+= ws[y-i][x-i];
			if (h.lookup(ne))
				if (!searchresults.contains(ne.toLowerCase())) {
					searchresults.add(ne.toLowerCase()); 
					count++;
				}
		}
		
		
		//east direction
		String e = "";
		
		for (int i = 0; y+i < length; i++) {
			e += ws[y+i][x];
			if (h.lookup(e))
				if (!searchresults.contains(e.toLowerCase())) {
					searchresults.add(e.toLowerCase()); 
					count++;
				}
		}
		
		//southeast direction
		String se = "";
		
		for (int i = 0; (x+i < length && y+i < length); i++) {
			se += ws[y+i][x+i];
			if (h.lookup(se))
				if (!searchresults.contains(se.toLowerCase())) {
					searchresults.add(se.toLowerCase()); 
					count++;
				}
		}
		
		//south direction
		String s = "";
		
		for (int i = 0; x+i < length; i++) {
			s += ws[y][x+i];
			if (h.lookup(s))
				if (!searchresults.contains(s.toLowerCase())) {
					searchresults.add(s.toLowerCase()); 
					count++;
				}
		}
		
		
		//southwest direction
		String sw = "";
	
		
		for (int i = 0; (x-i >= 0 && y+i < length); i++) {
			sw += ws[y+i][x-i];
			if (h.lookup(sw))
				if (!searchresults.contains(sw.toLowerCase())) {
					searchresults.add(sw.toLowerCase()); 
					count++;
				}
		}
		
		//west direction
		String w = "";
		
		for (int i = y; y-i >= 0; i++) {
			w += ws[y-i][x];
			if (h.lookup(w))
				if (!searchresults.contains(w.toLowerCase())) {
					searchresults.add(w.toLowerCase()); 
					count++;
				}
		}
		
			
		}
		
		
		
		


}


