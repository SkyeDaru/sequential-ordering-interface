package edu.nyu.cs.hsd262;

import java.util.ArrayList;


public class Sentence implements SequentiallyOrdered {
	
	//Sentence objects encapsulate list of Word objects
	
	//instance attributes
	private ArrayList<Word> words = new ArrayList<Word>();
	
	
	
	
	//constructors
	public Sentence(String str) {
		String[] split_string = str.split("\\s+");
		for (int i=0; i<split_string.length; i++) {
			String item = split_string[i];
			
			// Word word_obj = str.indexOf(i);
			this.words.add(new Word(item, i));
		}
		
	}
	
	
	//instance/implemented methods
	public ArrayList<Word> getWords() {
		return words;
	}
	
	public void setWords(ArrayList<Word> words) {
		this.words = words;
	}
	
	
	

	public Word getFirst() {
		Word x = words.get(0);
		return x;
	}


	public Word getLast() {
		Word x = words.get(words.size() - 1);
		return x;
	}

	
	public ArrayList<? extends OrderedThing> getSequence() {
		return words;
	}
	

	public String toString() {
		String new_string = "";
		for (Word x: this.words) {
			new_string += x.toString();
		}
		return new_string;
	}
	
	
	public String getValue() {
		String string = String.valueOf(this.words);
		return string;
	}

	
	
}
