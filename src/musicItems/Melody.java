package musicItems;
import java.util.ArrayList;


public class Melody {
	private ArrayList<Note> melody = new ArrayList<Note>();
	int numMeasures;
	
	public Melody(int numMeasures){
		this.numMeasures = numMeasures;
	}
	
	public void addNote(Note newNote){
		if((newNote.getLength() + getTotalMelodyLength()) <= numMeasures*MusicNotes.ITEMS_PER_MEASURE){
			melody.add(newNote);
		}else{
			System.out.println("New note \""+newNote.getNote()+"\" exceeds measure length.");
		}
	}
	
	public int getTotalMelodyLength(){
		int totalLength = 0;
		for(Note n: melody){
			totalLength+=n.getLength();
		}
		
		return totalLength;
	}
	
	public ArrayList<Note> getMelody(){
		return melody;
	}
	
	public String toString(){
		String melodyString = "";
		for(Note n: melody){
			melodyString+=n.getNote()+" ";
		}
		return melodyString;
	}
}
