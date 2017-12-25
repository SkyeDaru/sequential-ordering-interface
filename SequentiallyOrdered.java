package edu.nyu.cs.hsd262;

import java.util.ArrayList;

public interface SequentiallyOrdered {
	
	public OrderedThing getFirst();
	public OrderedThing getLast();
	public ArrayList<? extends OrderedThing> getSequence();

}
