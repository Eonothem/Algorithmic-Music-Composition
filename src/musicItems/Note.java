package musicItems;

public class Note {
	private String note;
	private int length;
	private int velocity;
	
	
	public Note(String note){
		this.note = note;
		length = MusicNotes.QUARTER_NOTE;
		velocity = 127;
	}
	public Note(String note, int length){
		this.note = note;
		this.length = length;
		velocity = 127;
	}
	
	public Note(String note, int length, int velocity){
		this.note = note;
		this.length= length;
		this.velocity = velocity;
	}
	
	public String getNote(){
		return note;
	}
	
	public int getLength(){
		return length;
	}
	
	public int getVelocity(){
		return velocity;
	}
	
	public String toString(){
		return getNote();
	}
}
