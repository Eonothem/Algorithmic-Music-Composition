package run;

import musicItems.Melody;
import musicItems.NotesMarkov;
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
		int numberOfMeasures = 1;
		//Note[] melody = new Note[numberOfMeasures*MusicNotes.ITEMS_PER_MEASURE];
		
		MelodyGenerator j = new MelodyGenerator();
		Melody m = j.generateMelody(ScaleGenerator.generateMajorScale("C"), 1);
		System.out.println(m);
	}
	
	public static int pickRandomNote(){
		double random = Math.random();
		double total = 0;
		for(int i = 0; i < NotesMarkov.matrix.length; i++){
			double val = NotesMarkov.matrix[0][i];
			//System.out.println(NotesMarkov.matrix[0][i]);
			total= total + val;
			if(val != 0 && random < total){
				return i;
			}
			//System.out.println(NotesMarkov.matrix[0][i]);
		}
		return -1;
	}
	
	public static String[] subdivide(int lo, int hi, String[] arr, float chanceToDiv){
		int maxSub = 1;
		int mid = lo+(hi-lo)/2;
		//System.out.println(mid);
		if(mid < arr.length && Math.random() < chanceToDiv){
			arr[mid] = "o";
		}
		chanceToDiv -= 0.3f;
		//System.out.println(chanceToDiv);
		if(Math.random() < chanceToDiv && mid < arr.length){
			arr = subdivide(lo, mid, arr, chanceToDiv);
		}
		
		if(Math.random() < chanceToDiv && mid < arr.length){
			arr = subdivide(mid+1, hi, arr, chanceToDiv);
		}
		return arr;
		//if(hi-lo <= 1){
			
		//}else{
			//subdivide(lo, mid, arr);
			//subdivide(mid+1, hi, arr);
		//}
	}
}
