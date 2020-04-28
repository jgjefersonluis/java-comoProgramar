package br.com.capitulo03.objetos;

public class GradeBook {

	private String courseName;

	public GradeBook(String name) {
		courseName = name;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String name) {
		courseName = name;
	}

	public void displayMessage() {
		System.out.printf("Welcome to the GradeBook for\n%s!\n",
				getCourseName());
	}
}
