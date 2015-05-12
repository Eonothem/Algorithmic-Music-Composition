package musicItems;

public class ChordCreator {
	private String[] scale;
	
	public ChordCreator(String[] scale){
		this.scale = scale;
	}
	
	public void setScale(String[] scale){
		this.scale = scale;
	}
	
	public Chord createTriad(int scaleDegree){
		Chord newChord = new Chord();
		int addOn = 0;
		for(int i = 1; i <= 3; i++){
			int noteDegree = scaleDegree-1+addOn;
			String noteToAdd = scale[(scaleDegree-1+addOn)%scale.length];
			
			if(noteDegree >= scale.length){
				noteToAdd+="'";
			}
			
			newChord.addNote(new Note(noteToAdd));
			addOn+=2;
		}
		
		return newChord;
	}
}
