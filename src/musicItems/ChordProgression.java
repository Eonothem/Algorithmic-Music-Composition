package musicItems;

import java.util.ArrayList;

public class ChordProgression{
	private ArrayList<Chord> progression = new ArrayList<Chord>();
	
	public ChordProgression(){
		
	}
	
	public ChordProgression(ArrayList<Chord> chords){
		progression = chords;
	}
	
	public void addChord(Chord toAdd){
		progression.add(toAdd);
	}
	
	public Chord getChord(int index){
		return progression.get(index-1);
	}
	
	public String toString(){
		return "";
	}
}
