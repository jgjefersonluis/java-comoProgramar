package capitulo6.imagensgraficas;

import java.awt.Component;

import javax.swing.JFrame;

public class DrawSmileyTest {

	public static void main(String[] args) {

		DrawSmiley panel = new DrawSmiley();
		JFrame application = new JFrame();

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(application);
		application.setSize(230, 250);
		application.setVisible(true);

	}

}
