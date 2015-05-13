package musicItems;

public class ScaleGenerator {
	
	public static String[] generateMajorScale(String tonic){
		//W,W,H,W,W,W,H
		int[] majorScaleStepPattern = new int[]{2,2,1,2,2,2,1};
		return generateScale(tonic, majorScaleStepPattern);
	}
	
	public static String[] generateMinorScale(String tonic){
		//W,H,W,W,H,W,W
		int[] minorScaleStepPattern = new int[]{2,1,2,2,1,2,2};
		return generateScale(tonic, minorScaleStepPattern);
	}
	
	public static String[] sharpsToFlats(){
	}
	
	private static String[] generateScale(String tonic, int[] stepPattern){
		String[] scale = new String[7];
		
		int currentPos = NoteTypes.allNotes.indexOf(tonic);
		for(int i = 0; i < 7;i++){
			scale[i] = NoteTypes.allNotes.get(currentPos);
			currentPos = (currentPos+stepPattern[i])%NoteTypes.allNotes.size();
		}
		
		return scale;
	}
}
