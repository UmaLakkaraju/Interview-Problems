package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class WordCount {

	public static void main(String[] args) {
		HashMap<String,Integer> wordcount=new HashMap<>();
		 FileReader fr = null;
		try {
			fr = new FileReader ("/Users/Uma/eclipse-workspace/codingInterview/src/test/Input.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}        
	       BufferedReader br = new BufferedReader (fr);     
	       String line = null;
		try {
			line = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	     
	       while (line != null) {
	          String []parts = line.split(" ");
	          for(String w : parts)
	          {
	           if(w.matches("[a-zA-Z]+"))
	           wordcount.put(w, wordcount.getOrDefault(w, 0)+1)	; 
	          }
	          try {
				line = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
	       }         
	       System.out.println(wordcount);
	    }

	}


