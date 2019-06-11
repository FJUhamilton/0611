package com.dom;
import java.io.*;
import java.util.*;
public class Search {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		ArrayList<String> areas = new ArrayList<>();
		ArrayList<String> code = new ArrayList<>();
	
		try {
			BufferedReader in = new BufferedReader(new FileReader("code.txt"));
			String line = in.readLine();
			while(line!= null) {
			System.out.print(line);
			line= in.readLine();
			String[] tokens = line.split(",");
			cities.add(tokens[0]);
			areas.add(tokens[1]);
			code.add(tokens[2]);
			}
			
		}catch(FileNotFoundException e) {
				e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
