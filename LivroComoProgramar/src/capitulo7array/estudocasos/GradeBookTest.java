package capitulo7array.estudocasos;

public class GradeBookTest {

	public static void main(String[] args) {

		int[][] gradesArray = { { 87, 96, 70 }, { 68, 878, 90 },
				{ 94, 100, 90 }, { 100, 81, 82 }, { 83, 65, 85 },
				{ 78, 87, 65 }, { 85, 75, 83 }, { 91, 91, 100 },
				{ 76, 72, 84 }, { 87, 93, 73 } };

		GradeBook myGradeBook = new GradeBook(
				"CS101 Introduction to Java Programming", gradesArray);

		myGradeBook.displayMessage();
		myGradeBook.processGrades();
	}

}
