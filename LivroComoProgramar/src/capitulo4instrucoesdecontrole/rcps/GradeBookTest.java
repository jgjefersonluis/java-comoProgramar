package capitulo4instrucoesdecontrole.rcps;

public class GradeBookTest {

	public static void main(String[] args) {

		GradeBook myGradeBook = new GradeBook(
				"CS101 Introduction to Java Programming");

		myGradeBook.displayMessage();
		myGradeBook.determinaClassAverage();

	}
}
