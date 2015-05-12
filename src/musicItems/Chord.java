package musicItems;

import java.util.ArrayList;

public class Chord {
	private ArrayList<Note> notes = new ArrayList<Note>();
	
	public Chord(){
		
	}
	
	public Chord(ArrayList<Note> notes){
		this.notes = notes;
	}
	
	public void addNote(Note toAdd){
		notes.add(toAdd);
	}
	
	public ArrayList<Note> getNotes(){
		return notes;
	}
	
	public String toString(){
		String toReturn = "";
		for(int i = 0; i < notes.size(); i++){
			toReturn += notes.get(i).getNote();
			
			if(i != notes.size()-1){
				toReturn+="-";
			}
		}
		
		return toReturn;
	}
}
