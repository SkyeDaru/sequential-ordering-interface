package edu.nyu.cs.hsd262;

import java.util.ArrayList;



public class Word extends OrderedThing implements SequentiallyOrdered {
	//Word objects encapsulate list of MyCharacter objects
	
	
	//instance attributes
	private ArrayList<MyCharacter> characters = new ArrayList<MyCharacter>();       //store a word's char sequence as MyCharacter object
	private int position = 0;                       //represents a word's position
	
	
	//constructors

	public Word(String str, int position) {
		
		for (int i = 0; i<str.length(); i++) {
			char_obj = str.charAt(i);
			this.characters.add(new MyCharacter(char_obj));
		}
			this.position = position;               //sets position of the word accordingly
	}
	


	
	
	//instance methods
	
	public ArrayList<MyCharacter> getCharacters() {
		return characters;
	}
	
	public void setCharacters(ArrayList<MyCharacter> characters) {
		this.characters = characters;
	}
	
	
	
	
	

	public MyCharacter getFirst() {
		MyCharacter x = characters.get(0);
		return x;
	}

	public MyCharacter getLast() {
		MyCharacter x = characters.get(characters.size()-1);
		return x;
	}

	public ArrayList<? extends OrderedThing> getSequence() {
		
		return characters;
	} 
	
	public int getPosition() {
		
		return position;
	}
	

	public String toString() {
		String new_string = "";
		for (MyCharacter x: this.characters) {
			new_string += String.valueOf(x);
		}
		return new_string;
	}
	
	
	
//public String getMyValue() {
//	String string = String.valueOf(this.characters);
//	return string;
//}



	
	
	
	
	

}
