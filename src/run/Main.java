package run;

import musicItems.NoteTypes;
import musicItems.ScaleGenerator;


public class Main {
	public static void main(String args[]){
		//BA Stands for Measure
		//CR is the current beat in the measure (1-4)
		//TR (track?)
		//CH (Channel)
		//NT (Note) A-G, 
		//C' means up an octave, C'' means up two octave etc
		//C- is down an octave, C-- etc
		//C# is sharp, Cb is flat
		//Last number is the length of the note
		
		int measure = 0;
		int beat = 0;
		int track = 0;
		int channel = 1;
		String note = "C";
		int noteLength = 4;
		
		String[] notes = new String[]{"C","D","E","F","G","A","B"};
		String total = "";
		int songLength = 9;
		String lastLine = "BA "+songLength+" CR 0 TR 0 CH 16 End of track";
		
		for(int i = 1; i < songLength; i++){
			String line = "BA "+i+" CR "+beat+" TR "+track + " CH "+channel+" NT "+notes[(int)(notes.length*Math.random())]+" "+noteLength;
			total+=line+"\n";
		}
		total+="\n"+lastLine;
		
		String[] s = ScaleGenerator.generateMinorScale("A");
		for(String lel : s){
			System.out.println(lel);
		}
	}
}
