package musicItems;

public class NotesMarkov {
	public static double[][] matrix = new double[][]{
		//Matrix is from to "to"
		//So [0][1] is the probability of the tonic note going to the second degree
		//[1][0] is the prob. of second degree going to the gonic
		{0.12, 0.14, 0.18, 0.14, 0.22, 0.10, 0.12},
		{0.10, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00},
		{0.10, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00},
		{0.10, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00},
		{0.10, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00},
		{0.10, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00},
		{0.10, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00},
	};
}
