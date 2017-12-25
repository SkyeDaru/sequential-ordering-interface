package edu.nyu.cs.hsd262;
import java.util.ArrayList;

public class TestSequence {
	
	public static void main(String[] args)  {
		
		//String text = "Hello my full name is Hayley Skye Darukhanavala";
		Sentence mySentence = new Sentence("Hello my full name is Hayley Skye Darukhanavala");
		
		
		System.out.println("THIS IS MY SENTENCE: Hello my full name is Hayley Skye Darukhanavala");
		System.out.println(".........................................................");
		
		
		System.out.println("The first word of my sentence is: " + mySentence.getFirst().toString());
		System.out.println("The last word of my sentence is: " + mySentence.getLast().toString());
		System.out.println("The sequence of my sentence is: " + mySentence.getSequence().toString());
		
		
		ArrayList<Word> words2 = mySentence.getWords();
		System.out.println("The first character of the first word is: " + words2.get(0).getFirst().getValue());
		System.out.println("The last character of the last word is: " + words2.get(7).getLast().getValue());
		System.out.println("The sequence of the first word is: " + words2.get(0).getSequence().toString());
		System.out.println("The position of the last word is: " + words2.get(7).getPosition());
		
		
	}

}
