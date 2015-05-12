package musicItems;

public class Note {
	private String note;
	private String length;
	private int velocity;
	
	
	public Note(String note){
		this.note = note;
		length = NoteTypes.QUARTER_NOTE;
		velocity = 127;
	}
	public Note(String note, String length){
		this.note = note;
		this.length = length;
		velocity = 127;
	}
	
	public Note(String note, String length, int velocity){
		this.note = note;
		this.length= length;
		this.velocity = velocity;
	}
	
	public String getNote(){
		return note;
	}
	
	public String getLength(){
		return length;
	}
	
	public int getVelocity(){
		return velocity;
	}
	
	public String toString(){
		return getNote();
	}
}
