package musicItems;

import java.util.ArrayList;
import java.util.Arrays;

public class MusicNotes {
	//Whole Note can stand in for note
	public final static int ITEMS_PER_MEASURE = 16;
	public final static int WHOLE_NOTE = ITEMS_PER_MEASURE;
	public final static int HALF_NOTE = WHOLE_NOTE/2;
	public final static int QUARTER_NOTE = WHOLE_NOTE/4;
	public final static int EIGTH_NOTE = WHOLE_NOTE/8;
	public final static int SIXTEENTH_NOTE = WHOLE_NOTE/16;


	public final static String[] fullScale = new String[]{"A","A#","B","C","C#","D","D#","E","F","F#","G","G#"};
	public final static String rest = "*";
	public final static ArrayList<String> allNotes = new ArrayList<String>(Arrays.asList(fullScale));

}
