package edu.nyu.cs.hsd262;



public class MyCharacter extends OrderedThing {
	
	char char_obj;
	
	
	
	public MyCharacter(char char_obj) {
		//Character c = Character.valueOf(char_obj);
		this.char_obj = char_obj;
	}
	
	
	
public String getValue() {
	String string = String.valueOf(this.char_obj);
	return string;
}

public String toString() {
	return Character.toString(this.char_obj);
}

	
	
}
