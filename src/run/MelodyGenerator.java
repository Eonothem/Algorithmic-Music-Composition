package run;

import musicItems.Melody;
import musicItems.Note;

public class MelodyGenerator {
	public Melody generateMelody(String[] scale, int numberOfMeasures){
		Melody m = new Melody(numberOfMeasures);
		
		m.addNote(new Note("A"));
		m.addNote(new Note("B"));
		m.addNote(new Note("C"));
		m.addNote(new Note("D"));
		
		return m;
	}
}
